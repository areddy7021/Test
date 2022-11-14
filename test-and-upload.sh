
cd $2/$3
defaultSimulator='platform=iOS Simulator,name=My-iphone11,OS=14.0'
#### test the created build in simulator
xcodebuild -workspace $3.xcworkspace -scheme $3 -derivedDataPath reports/ -destination '${4:-$defaultSimulator}' -enableCodeCoverage YES clean build test
#xcrun xccov view --report reports/Logs/Test/*.xcresult/ > sonarqube-generic-coverage.xml

../../xcode-coverage-mapper.sh reports/Logs/Test/*.xcresult/ > sonarqube-generic-coverage.xml
xcrun simctl delete $newDeviceId
brew reinstall sonar-scanner
#upload report json to sonar
sonar-scanner -Dsonar.login=admin -Dsonar.password=admin1 -Dsonar.projectKey=$3 -X
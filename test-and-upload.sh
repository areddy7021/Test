
cd $2/Hello
#### test the created build in simulator
#xcodebuild test -project Hello.xcodeproj -scheme Hello -destination 'platform=iOS Simulator,name=My-iphone11,OS=14.0'
#xcodebuild test -workspace Hello.xcworkspace -scheme Hello -destination 'platform=iOS Simulator,name=My-iphone11,OS=14.0'
xcodebuild -workspace Hello.xcworkspace -scheme Hello -derivedDataPath reports/ -destination 'platform=iOS Simulator,name=My-iphone11,OS=14.0' -enableCodeCoverage YES clean build test
#xcrun xccov view --report reports/Logs/Test/*.xcresult/ > sonarqube-generic-coverage.xml

../../xcode-coverage-mapper.sh reports/Logs/Test/*.xcresult/ > sonarqube-generic-coverage.xml
xcrun simctl delete $newDeviceId
brew reinstall sonar-scanner
#upload report json to sonar
sonar-scanner -Dsonar.login=admin -Dsonar.password=admin1 -Dsonar.projectKey=Hello-Mac -X
#xcodebuild test -project Hello.xcodeproj -scheme Hello -destination 'platform=iOS Simulator,arch=x86_64'
#clear or delete created devices.sudo xcrun simctl delete <deviceid>

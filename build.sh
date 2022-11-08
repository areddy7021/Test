
cd $2/Hello

path="$(pwd)"

echo "path is after in build folder ........**************  $path"

xcodebuild clean

sudo xcrun simctl shutdown all && sudo xcrun simctl erase all

deviceName='My-iphone11'

deviceId=$(xcrun simctl list | grep -w $deviceName | awk 'match($0, /\(([-0-9A-F]+)\)/) { print substr( $0, RSTART + 1, RLENGTH - 2 )}')

echo "Printing the Device ID"
echo $deviceId

if [ -z "$deviceId" ]
then
      echo "\$deviceId is empty"
else
      echo "\$deviceId is NOT empty"
      xcrun simctl delete $deviceId
fi

#xcrun simctl list | grep -w �~@~\My-iphone11�~@~] | awk -F �~@~\[()]�~@~] �~@~X{ for (i=2; i<NF; i+=2) print $i }�~@~Y | grep �~@~X^[-A-Z0�~@~S9]*$�~@~Y | xargs -I uuid xcrun simctl delete uuid
##Addif if there is already device pls delete it or move forward
#xcrun simctl list
#sudo xcrun simctl shutdown all && sudo xcrun simctl erase all
#sudo xcrun simctl delete <deviceid>
newDeviceId=$(xcrun simctl create $deviceName com.apple.CoreSimulator.SimDeviceType.iPhone-11 com.apple.CoreSimulator.SimRuntime.iOS-14-0)
brew reinstall cocoapods
brew link --overwrite cocoapods
echo "path is after ios folder ........**************  $path"
#cd $2
echo "path is after ios folder after scripts ........**************  $path"
pod init
pod install
mkdir builds
xcodebuild -workspace Hello.xcworkspace/ -scheme Hello -sdk iphonesimulator -allowProvisioningUpdates -derivedDataPath builds -destination 'platform=iOS Simulator,name=My-iphone11,OS=14.0'

!/bin/bash
echo "Setting up the Environment for Build & Test"
chmod 755 setup.sh
chmod 755 build.sh
chmod 755 test-and-upload.sh
./setup.sh $1 $2
echo "Setup Complete and preparing for Build"
./build.sh $1 $2
echo "Build Complete and preparing for Test and Upload results to Sonarqube"
./test-and-upload.sh $1 $2

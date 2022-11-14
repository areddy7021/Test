# Congigure AWS Credentials

cd $2/$3
echo "Configuring AWS Code Artifact Credentials"

#aws configure set aws_access_key_id AKIATTVWCAAEIKFFV7NN
#aws configure set aws_secret_access_key 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
aws configure set default.region us-east-1
echo "AWS Code Artifact :: Credentials configured successfully"
# Login and get token

echo "AWS Code Artifact :: Fetching token"

export CODEARTIFACT_AUTH_TOKEN=`aws codeartifact get-authorization-token --domain amtrak-api --domain-owner 716869923711 --region us-east-1 --query authorizationToken --output text`
#AWS_AUTH_TOKEN=aws codeartifact login --tool maven --repository iphone-apps --domain first-domain --domain-owner 248416174088 --region eu-west-2

echo "AWS Code Artifact :: Retrieved token successfully"

# Upload the artifact to AWS codeartifact

echo "AWS Code Artifact :: Uploading artifact"

#/Users/ec2-user/Scripts/sample3/Hello/builds/Build/Products/Debug-iphonesimulator

curl --request PUT https://amtrak-api-716869923711.d.codeartifact.us-east-1.amazonaws.com/maven/mac-ios/com/mycompany/app/$3/1.0/$3.app \
     --user "aws:$CODEARTIFACT_AUTH_TOKEN" \
     --data-binary @/builds/Build/Products/Debug-iphonesimulator/$3.app

echo "AWS Code Artifact :: Uploaded successfully"
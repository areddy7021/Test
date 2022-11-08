sudo chown -R $(whoami) /usr/local/Homebrew

/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)" < /dev/null

#./install.sh https://90020517:MjYyNDkwNTU1NjgyOnTH5+GY5oeM24czoMnQoUI0NZ54@bitbucket.amtrak.com/scm/poc/cm-macos-repo-demo-app-demoios-aac.git Sample

 echo 'eval "$(/usr/local/bin/brew shellenv)"' >> /Users/$USER/.zprofile

 eval "$(/usr/local/bin/brew shellenv)"

 sudo chown -R $(whoami) /usr/local/share/zsh /usr/local/share/zsh/site-functions

 sudo chown -R $(whoami) /usr/local/var/homebrew

 sudo chown -R $(whoami) /usr/local/Cellar

 sudo chown $(whoami):staff /usr/local/Caskroom

 # Install the latest version of Java
 brew tap adoptopenjdk/openjdk

 # Install any java version according to the app
 brew reinstall adoptopenjdk11

 # Export JAVA_HOME
 export JAVA_HOME=$(/usr/libexec/java_home)

 echo 'export JAVA_HOME=$(/usr/libexec/java_home -v11)' >> ~/.bash_profile

 # Verify installation
 java -version
 echo $JAVA_HOME

  export HOMEBREW_NO_INSTALL_CLEANUP=TRUE


# Install Git ###########################################################################################################################################

echo '###Installing Git..'
brew reinstall git

# Git Configuration
echo '###Congigure Git..'

echo 'Git has been configured!'
git config --list

# Git Clone Repo ssh://git@bitbucket.amtrak.ad.nrpc:7999/aa/amtrakautomationframework.git ########### https://bitbucket.amtrak.com/scm/aa/amtrakautomationframework.git ################################################################################################################################
# ./install.sh https://90020517:MjYyNDkwNTU1NjgyOnTH5+GY5oeM24czoMnQoUI0NZ54@bitbucket.amtrak.com/scm/poc/cm-macos-repo-demo-app-demoios-aac.git  test2345
#sudo -u ssm-user xip -x Xcode_12.xip

# this script clones a repository, including all its remote branches

GIT=`which git`

if [ "x$1" = "x" -o "x$2" = "x" ];then
  echo "use: $0 <git_repository_to_clone> <directory>"
  exit 1
fi

if [ "x$GIT" = "x" ];then
  echo "No git command found. install it"
fi

function clone {

  $GIT clone -q $1 $2
  res=$?
  chmod -R 777 $2/
  cd $2

  $GIT pull --all

  for remote in `$GIT branch -r | grep -v \>`; do
     $GIT branch --track ${remote#origin/} $remote;
  done
}

echo "cloning repository into ... $2"
clone $1 $2

chmod -R 777 $2/

sudo xcode-select --switch /Applications/Xcode.app/Contents/Developer

sudo xcodebuild -runFirstLaunch

sudo xcodebuild -license accept

#cd $2
#cd Hello

path="$(pwd)"
echo "path is after ios folder ........  $path"

export LANG=en_US.UTF-8

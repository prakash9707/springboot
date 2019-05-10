node{
def mvnHome
stage('git checkout process'){
  echo 'started checkout'
  git 'https://github.com/prakash9707/springboot'
  echo 'completed sucessfully'
}

stage('compile package'){
mvnHome = '/opt/apache-maven/bin'
sh "'${mvnHome}/mvn' -Dmaven clean package"
echo 'started compiling'
}
}

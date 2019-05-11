node{
def mvnHome
stage('git checkout process'){
  echo 'started checkout'
  git 'https://github.com/prakash9707/springboot'
  echo 'completed sucessfully'
}

stage('compile package'){
mvnHome = tool name: 'Maven', type: 'maven'
sh "${mvnHome}/bin/mvn package"
echo 'started compiling'
}

stage("Email Notification"){
  emailext body: 'Hi text msg', subject: 'Mail from Jenkins', to: 'prakashpp666666@gmail.com'
}
}

node{
def mvnHome
stage('git checkout process'){
  echo 'started checkout'
  git 'https://github.com/prakash9707/employee'
  echo 'completed sucessfully'
}

stage('compile package'){
mvnHome = '/opt/apache-maven/bin'
sh "${mvnHome}/mvn package"
echo 'started compiling'
}
  
  stage('Email Notification'){
    emailext body: 'hai', subject: 'jenkins', to: 'prakash.a@purpleslate.in'
  }
}

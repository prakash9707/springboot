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
  
  stage('SonarQube analysis') {
    withSonarQubeEnv('sonarqube') {
      mvnHome = '/opt/apache-maven/bin'
      sh "${mvnHome}/mvn sonar:sonar"
      
    }
  }
  
  stage('Email Notification'){
    emailext body: 'Hai', subject: 'Jenkins', to: 'prakashpp666666@gmail.com'
  }
}

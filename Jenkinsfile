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
  
  stage("Quality Gate"){
          timeout(time: 1, unit: 'HOURS') {
              def qg = waitForQualityGate()
              if (qg.status != 'OK') {
                  emailext body: 'Your code was failed due to sonarqube quality gate', subject: 'Jenkins Failed Report', to: 'prakashpp666666@gmail.com'
                  error "Pipeline aborted due to quality gate failure: ${qg.status}"
                  
              }
          }
      }
  
        
  
  stage('Email Notification'){
    emailext body: 'Your code was succesfully build', subject: 'Jenkins Success Report', to: 'prakashpp666666@gmail.com'
  }
}

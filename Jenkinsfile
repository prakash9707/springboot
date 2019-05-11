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
  
  stage('Sonar:QG') {
            steps {
                **sleep(10)  /* Added 10 sec sleep that was suggested in few places*/**
                script{
                    timeout(time: 10, unit: 'MINUTES') {
                        def qg = waitForQualityGate abortPipeline: true
                        if (qg.status != 'OK') {
                            echo "Status: ${qg.status}"
                            error "Pipeline aborted due to quality gate failure: ${qg.status}"
                        }
                    }
                }
            }
        }       
  
  stage('Email Notification'){
    emailext body: 'Your code was succesfully build', subject: 'Jenkins Success Report', to: 'prakashpp666666@gmail.com'
  }
}

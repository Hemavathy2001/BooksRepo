pipeline{
    agent any 
    tools{
        maven "Jenkins-maven"
    }
    stages{
        stage("maven install"){
            steps{
                  sh 'clean install'
                  echo ' installed ' 
            }
        }
        stage("test"){
            steps{
                echo 'testing'
            }
        }
    }
}

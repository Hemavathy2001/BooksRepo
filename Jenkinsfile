pipeline{
    agent any 
    tools{
        maven 'Jenkins-maven'
    }
    stages{
        stage("maven install"){
            steps{
                  sh 'clean install'
            }
        }
        stage("test"){
            steps{
                echo 'testing'
            }
        }
    }
}

pipeline{
    agent any 
    tools{
        maven 'Jenkins-maven'
    }
    stages{
        stages("maven install"){
            sh 'clean install'
        }
    }
}

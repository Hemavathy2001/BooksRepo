pipeline{
    agent any 
    tools{
        maven "Jenkins-maven"
    }
    stages{
        stage("build"){
            steps{
                  sh 'mvn -B -DskipTests clean package'
                  echo ' installed ' 
            }
        }
    }
}

pipeline{
    agent any 
    tools{
        maven "Jenkins-maven"
    }
    stages{
        stage("development"){
            steps{
                  sh 'mvn -B -DskipTests clean package'
                  echo ' installed jar file  ' 
            }
        }
        stage("test"){
            steps{
                echo ' testing the application '
            }
        }
        stage("production"){
            steps{
               echo ' production '   
            }
        }
    }
    post{
        always{
            
            echo 'I am awesome I run always'
        }
        success{
            echo 'I run when you are successfull'
        }
        failure{
            echo 'I run when you fail'
        }
    }
}

pipeline{
    agent any 
    triggers{
         pollSCM "* * * * *"
    }
    tools{
        maven "Jenkins-maven"
    }
//     environment{
//         dockerImage = ''
//         registry = 'hrc1663/bookstore'
//         registryCredential='Docker'
//     }
    stages{
        stage("development"){
            steps{
//                  sh 'mvn -B -DskipTests clean package'
                  echo ' installed jar file ... ' 
                  sh 'mvn --version'
//                   script{
//                     dockerImage = docker.build registry
//                       docker.withRegistry('',registryCredential){
//                           dockerImage.push()
//                       }
//                 }
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

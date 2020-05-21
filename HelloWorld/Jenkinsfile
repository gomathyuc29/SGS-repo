pipeline {
    agent any
    stages {
        stage('build') {
            
            steps{
            	withMaven(maven:'maven_3_5_3'){
            		sh 'mvn clean package'
            	}
            	}
            }
            
         stage('deploy')
         {
         steps{
         withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'PCF_LOGIN',
usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {

sh 'echo uname=$USERNAME pwd=$PASSWORD'
 }
         
         }
         	
         	}
        }
    }
}
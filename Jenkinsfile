pipeline {
    agent none
    
    stages {
        stage('example build') {
            steps {
                echo 'jenkins sample build ! ${AUTHOR}'
                echo 'jenkins sample build ! ${AUTHOR}'
                echo 'sample'
            }
        }
    }
    post {
        always {
            echo 'post process !'
        }
    }
}
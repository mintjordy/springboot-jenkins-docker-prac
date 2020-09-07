pipeline {
    agent none
    
    stages {
        stage('example build') {
            steps {
                echo 'here is develop branch'
            }
        }
    }
    post {
        always {
            echo 'post process !'
        }
    }
}
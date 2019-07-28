pipeline {
    agent any 
    stages {
        stage('Build Maven Project') {
            steps {
                    echo 'Building Maven project'
                    sh '''
                    mvn validate
                    mvn compile
                    mvn test
                    '''
            }
        }
    }
}


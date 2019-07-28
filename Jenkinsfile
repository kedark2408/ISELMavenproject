pipeline {
    agent any 
    stages {
        stage('Build Maven Project') {
            steps {
                try {
                    echo 'Building Maven project'
                    sh '''
                    mvn validate
                    mvn compile
                    mvn test
                    '''
                    }
                catch (Exception e) {
                    echo 'Build failed'
                }
            }
        }
    }
}


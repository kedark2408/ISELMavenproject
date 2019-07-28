pipeline {
    agent any 
    stages {
        stage('Build Maven Project') {
            steps {
                    echo 'Building Maven project'
                    sh '''
                    mvn validate
                    mvn compile
                    mvn tes
                    '''
            }
        }
        stage('Package Maven Project') {
            steps {
                echo 'Packaging the Maven project'
                sh 'mvn package'
            }
        }
    }
}

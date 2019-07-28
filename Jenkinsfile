pipeline {
    agent any 
    stages {
        stage('Build Maven Project') {
            options {
                      warnError('This build is unsuccesful')
                      skipStagesAfterUnstable()
            }
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

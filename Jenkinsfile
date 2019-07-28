pipeline {
    agent any 
    stages {
        boolean buildTestPassed = true
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
                    buildTestPassed = false
                }
            }
        }
        stage('Package Maven project') {
            if (buildTestPassed) {
                steps {
                    echo 'Packaging the Maven project'
                    sh 'mvn package'
                }
            }
            else {
                echo 'Package step aborted'
            }
        }
    }
}


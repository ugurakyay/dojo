pipeline {
    agent any
    tools {
        // Maven tool configuration
        maven "maven" // Maven aracının adını buraya ekleyin (Jenkins'de yapılandırılan ad)
    }
    stages {
        stage('Build') {
            steps {
                // Maven build steps
                sh 'mvn clean install'
            }
        }
    }
}

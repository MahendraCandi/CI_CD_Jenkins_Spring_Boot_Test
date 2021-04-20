pipeline {
    agent {
        label 'digital_ocean'
    }
    stages {
        stage('Checkout') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', credentialsId: '4b1f213c-965b-4563-a21a-ee710993fc79', url: 'https://github.com/MahendraCandi/jenkins_demo.git'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/install/apache-maven-3.8.1/bin/mvn -Dmaven.test.failure.ignore=true clean package'
            }
        }
        stage('Test') {
            steps {
                sh '/opt/install/apache-maven-3.8.1/bin/mvn test'
            }
        }
        stage('Deploy') {
            steps {
                deploy adapters: [tomcat8(credentialsId: 'ba69152e-e48d-45ce-8456-e6299b826643', path: '', url: 'http://159.65.140.154:8089/')], contextPath: 'demo-app', onFailure: false, war: '**/*.war'
            }
        }
    }
}

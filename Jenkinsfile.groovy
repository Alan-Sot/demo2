pipeline {
    agent {
        label 'slave1'
    }
    triggers {
        pollSCM('*****')
    }
    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactmNumToKeepStr: '10'))
        timestamps()
    }
    stages {
        stage ("start") {
            steps {
                echo "start"
            }
        }
        stage ("doing something") {
            steps {
                echo "doing something"
            }
        }
        stage ("finish") {
            steps {
                echo "finish"
            }
        }
    }
}
pipeline {
    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '10', artifactNumToKeepStr: '10'))
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
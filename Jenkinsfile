pipeline {
    agent any
    stages {
        stage('Add Numbers') {
            steps {
                script {
                    def a = 10
                    def b = 20.toInteger()  // Convert string param to int if needed
                    def sum = a + b
                    echo "Sum of ${a} and ${b} is ${sum}"
                }
            }
        }
    }
}

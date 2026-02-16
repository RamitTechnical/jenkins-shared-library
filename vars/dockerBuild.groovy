def call(String imageName) {
    echo "Running Test"
    sh "docker build -t ${imageName} ."
}

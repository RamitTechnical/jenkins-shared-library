def call(Map config) {
    echo "Building the application"
    git url: config.gitUrl, branch: config.branch
}

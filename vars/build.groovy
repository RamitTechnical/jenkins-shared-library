def call(String projectname, String tag, String dockerHubUser) {
    sh "docker build -t ${dockerHubUser}/${projectname}:${tag} ."
}

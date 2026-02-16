def call(Map config) {

    echo "Pushing the application"

    withCredentials([
        usernamePassword(
            credentialsId: config.dockerCredId,
            usernameVariable: 'dockerHubUser',
            passwordVariable: 'dockerHubPassword'
        )
    ]) {
        sh """
           docker tag ${config.imageName} ${dockerHubUser}/${config.imageName}:latest
           docker login -u ${dockerHubUser} -p ${dockerHubPassword}
           docker push ${dockerHubUser}/${config.imageName}:latest
        """
    }
}

def call(String project,String tag,String dockerHU){
   withCredentials([usernamePassword(credentialsId: 'Docker-Hub', usernameVariable: 'dockerHU', passwordVariable: 'dockerHP')]) {
                    // sh "docker tag note-app ${env.dockerHU}/note-app:latest"
                    sh "docker login -u ${dockerHU} -p ${dockerHP}"
                    sh "docker push ${dockerHU}/${project}:${tag}" 
}


               

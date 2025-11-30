def call(String projectname,String tag,String DockerHubUser)
{
  sh "docker build -t ${DockerHubUser} ${projectname}:${tag} ."
}

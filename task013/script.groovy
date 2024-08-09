def build_jar(){
    sh "mvn install"
}

def test(){
    sh "mvn test"
}



def build_image(){
    withCredentials([ usernamePassword(credentialsId: 'dockerhub-conn', usernameVariable: 'USER', passwordVariable: 'PASS')])
        {
            sh "docker build -t rashadahmed424/spring-pet-app:BUILD_NUMBER ."
            sh "echo $PASS | docker login -u ${USER} --password-stdin"
            sh "docker push rashadahmed424/spring-pet-app:BUILD_NUMBER"
        }

}
return this

./gradlew clean build

docker build -t mdigtk/demo:latest .
docker login  -u mdigtk --password ${{ secrets.DOCKER_USER_PASSWORD }}
docker push mdigtk/demo:latest
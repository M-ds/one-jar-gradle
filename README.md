# Fat Jar Gradle
This is a sample project, to create a fat-jar containing the frontend and multiple modules. Within this project lean architecture is used. With the frontend focuessed on Vue.JS, and backend with Java

## Creating the jar
- `./gradlew assembleFrontend`
- `./gradlew moveFiles`
- `./gradlew build`
- `mv ./presentation/build/libs/presentation-0.1-SNAPSHOT.jar ~/Desktop`
- `sudo java -jar presentation-0.1-SNAPSHOT.jar`

# Bootstrap Skeleton
Based on [kata-bootstraps](https://github.com/swkBerlin/kata-bootstraps)

Template project for quick start coding by applying practices and principles
- TDD
- XP
- Clean Code
- Pair Programming

## Tech Stack:
- Maven and Gradle wrappers as building tools
  - referencing Java version
  - basic plugins and dependencies
- JUnit 5 and Cucumber for testing coverage

## Version Control
```shell
git init
touch README.md
touch .gitignore
git add .
git commit -m "initial commit"
# create repo on GitHub or share by IntelliJ VCS Share
git remote add origin https://github.com/maniec/bootstrap-skeleton.git
git branch -M main
git push -u origin main
```

## Mavenize
```shell
# create basic pom.xml or copy from other project
touch pom.xml
mvn -N wrapper:wrapper
./mvnw clean install
# force adding the wrapper .jar that might be excluded from .gitignore
git add -f .mvn/wrapper/maven-wrapper.jar
```

## Gradlenize
```shell
gradle init
gradle wrapper
# force adding the wrapper .jar that might be excluded from .gitignore
git add -f gradle/wrapper/gradle-wrapper.jar
./gradlew idea
```

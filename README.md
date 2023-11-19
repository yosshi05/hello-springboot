# run
gradle run

gradle bootJar
java -jar app/build/libs/app.jar

docker run -v ./app/build/libs/:/tmp -p 8080:8080 eclipse-temurin java -jar /tmp/a
pp.jar

http://localhost:8080

docker-compose up -d

mvn clean package
docker build -t dockerlegal .
docker run -p 8081:8080 -d --name application dockerlegal
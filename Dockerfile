FROM java
copy target/javadocker-1.0-SNAPSHOT.jar /usr/src/javadocker-1.0-SNAPSHOT.jar

CMD java -cp /usr/src/javadocker-1.0-SNAPSHOT.jar Main

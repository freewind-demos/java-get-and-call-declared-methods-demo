Java Get and Call Declared Methods Demo
=====================

如何拿到一个class的method并且调用。

How to run:

1. Run `Hello.java` in your IDE.
2. Use maven plugin `exec-maven-plugin`:
   ```
   mvn clean compile exec:java
   ```
3. Use maven plugin `maven-dependency-plugin` and `maven-jar-plugin`
   ```
   mvn clean package; java -jar target/demo.jar
   ```
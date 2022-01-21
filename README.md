## algorithm-resolution
This repository contains some popular algorithm resolution based on the AlgoExpert.io platform.
  
Level: Advanced.    
Technologies: Java 17, JUnit 5, GraalVM and Maven.    
Target Product: Java native image.

* The [AlgoExpert.io](https://algoexpert.io) website.

### Test Driven Design (TDD)
I use TDD methodology to prove the functionality of each algorithm in first place. I also added some test cases using JUnit 5 to validate the input and output of each algorithm.
Then, I create the final method and class that contains the tested code.
If you want to execute only the tests with maven, you must execute:
```
mvn test
```

### Packaging and Execution
I created a main class that must be run with the JAR command. This class calls all developed algorithms sending them some test data as input parameters to execute each function. 
The main idea here is to validate the "Time Complexity" of each algorithm. You can update the code base as you wish to do a better performance execution.
Then, you need to execute the following command to package and run the project:
```
mvn clean package
```
```
java -jar target/algorithm-resolution.jar
```

### Native Image
You can create a native image using GraalVM. For this project, I am using the community edition 21.3.0 that contains Java SDK 17. Also, you can use "SDK Man" tool to manage your local environment SDK like Maven or Java. 
To do this, you can execute the following command to create the image, after packaging the project with Maven:
```
native-image -jar target/algorithm-resolution.jar
```
**NOTE**: If you get an error message like >>> "command not found: native-image", then you need to install "native-image" tool first:
```
gu install native-image
```
The executable will be created in the working directory. You can execute it and analyze the new total execution time of the program:
```
./algorithm-resolution
``` 

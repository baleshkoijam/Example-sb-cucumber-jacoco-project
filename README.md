# Simple example describing the integration of Cucumber and Jacoco for a Spring boot microservice application.

# Intention of the project
  - Generate jacoco code coverage report for the cucumber tests for spring boot microservice application

# Steps to be followed:
  1. from Intellji > open "Run/Debug configuration" window  and select the boot run under the Gradle on upper left side of the window.
  2. type the below in the text box against the "VM options:"
      -javaagent:D:\\JavaAgents\\org.jacoco.agent-0.8.2-runtime.jar=destfile=D:\\JavaAgents\\output\\jacoco.exec,append=true
      Note : i am assuming that the jacoco agent is stored in my local under the path "D:\\JavaAgents\\org.jacoco.agent-0.8.2-runtime.jar"
       and also i am assuming that the jacoco.exec will be generated under the path D:\\JavaAgents\\output
       update the above accordingly.
       
    3. click apply and ok.
    
    4. Follow the same steps for the CucumberRunner class under "junit" which is available on the upper left corner of the window.
    
    5. Do Boot run the application.
    
    6. Once the application is started successfully, open the CucumberRunner.java class, right click on the file and 
      select "Run CucumberRunner". This will start the cucumber test execution.
      
    7. once the test are executed successfully, go to the location where the jacoco.exec file should be generated and verify
      the jacoco.exec file is there with size more than 0 byte.
      
    8. Stop the boot run.
    
    9. Got to intellji IDE, select Analyze> show coverage data. click on the "+" sign and select the jacoco.exec file that
        was  generated. you will see the code coverage details. use the "Generate coverage report" icon to generate the jacoco
        html report
        
        
        NOTE:  a Sample jacoco.exec file has been included in the project under the root folder, use this file to see the report.
    

# src module:
contains all the spring boot related classes. short description of the classes are given below:
  # hello.Application.java :
    the spring boot application class.
  # hello.DemoController.java
   the controller class
  # hello.Person.java
  the pojo class that have the setters and getters for the object to be used.
  # hello.Data.java
  - a simple class that represents the data layer,which provides methods to get the values of the various properties of the object person
  
  # bdd module : this modules contains all the cucumber related classses
  # main.CucumberRunner.java 
  - the cucumber runner class, right click on this file and select "run" to execute the cucumber tests.
  
  # stepdef.stepdef.java
  -  the step definition class , this class will have the java implementation of the features defined in the feature file for the test.
  NOTE: the microservice is invoked from inside the "When" block of this class using the restAssured library, refer the code inside the           when block of the stepdef class for more details.
  
  # scenario.feature
  - this is the feature file which contains the tests scenarios to be executed.
  
 
  NOTE: refer the individual build.gradle files for each modules to see the dependencies details that were added.
  
  
  
  
    
  

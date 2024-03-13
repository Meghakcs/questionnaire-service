# questionnaire-service
How to Run:

Clone this repository
Make sure you are using JDK 1.8 and Gradle 4.x above.
Import the project in STS, build and run the project.

To Test the API in Postman or Browser:
http://localhost:8080/api/questions

I have added a Mockito Test case as part of Unit Testing.

Created a script to containerise our app into docker and which will run on port 5000. 
1. Installed docker desktop for windows.
2. Build spring boot application , JAR will be created in target folder.
3. Run script which consists of command to build docker Iamge and run the Image on Port 5000.
4. We can access our endpoint on http://localhost:5000/api/questions

Assumptions made:

1. Since it was specified to avoid real data sources, I have created a json file questions.json and reading the data from hardcoded json file.

Few Areas could be improved :

1. I could have added Logging and exception handling.

   
   

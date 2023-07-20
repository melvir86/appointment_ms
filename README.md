# Appointment Backend Microservice for MedCentral application
This is a shared code repository for the Appointment Backend Microservice of MedCentral application

[For testers & public - how to run the program]

# Installing Required Pre-Requisites
1. Install jdk/jre
2. Download maven
3. Download whole application and copy to any of your local folders (recommend to create a folder for MedCentral specifically)
   
# Starting the application
5. Open command prompt and go to your microservice's folder
6. Type 'mvn spring-boot:run' to start the application
7. Backend is now running successfully
8. To test, either access via a software such as Postman or directly from the frontend application on browser (assuming it is already running)
9. Recommend to test RESTful endpoint via GET (http://localhost:8084/api/v1/Appointments) to see if JSON result is returned with status code 200

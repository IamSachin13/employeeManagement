# Employee Management Application - Documentation

1. Project Overview
   The Employee Management Application is a simple CRUD-based web application built using Spring Boot, Thymeleaf (Frontend), MongoDB (Database), and Swagger (API Documentation). This application allows users to add, view, update, and delete employees.

2. Technology Stack
   Backend: Spring Boot (Spring MVC, Spring Data MongoDB, Spring REST)
   Frontend: Thymeleaf, HTML, CSS, JavaScript
   Database: MongoDB
   API Documentation: Swagger (Springdoc OpenAPI)
3. Prerequisites 
   * Before running the project, ensure you have the following installed:
   * Java Development Kit (JDK 11 or later)
   * Maven (for dependency management)
   * MongoDB (Database)
* IntelliJ IDEA or Eclipse (Recommended IDEs)

  4. Project Setup and Configuration

  Clone the Project
         git clone https://github.com/your-repo/employee-management.git
         cd employee-management
           

    Configure MongoDB Connection 
            MongoDB Configuration

          spring.data.mongodb.uri=mongodb://localhost:27017/employeedb
          Thymeleaf Configuration (Optional)
          spring.thymeleaf.cache=false
           

5. Running the Application
     5.1 Build the Application

     mvn clean install

     5.2 Run the Application

     mvn spring-boot:run
     5.3 Access the Application
         Web UI (Thymeleaf):
         http://localhost:8080/

6. Api documentation

    1. GET /api/employees
    Retrieve all employees.
    curl -X GET http://localhost:8080/api/employees


        2. GET /api/employees/{id}
        Retrieve a specific employee by their ID.
        Replace <employee_id> with an actual employee ID (e.g., 60a7e3f03f7f2c001a2a3b45).
        curl -X GET http://localhost:8080/api/employees/<employee_id>


        3. POST /api/employees
        Create a new employee.
        Provide a JSON payload with firstName, lastName, and email.
        curl -X POST http://localhost:8080/api/employees \
            
        {
        "firstName": "John",
        "lastName": "Doe",
        "email": "john.doe@example.com"
        }'
        
        4. PUT /api/employees/{id}Update an existing employee's details.
        Replace <employee_id> with the actual employee ID and provide the updated JSON payload.
        
        curl -X PUT http://localhost:8080/api/employees/<employee_id> \
        {
        "firstName": "Jane",
        "lastName": "Smith",
        "email": "jane.smith@example.com"
        }'
        
        5. DELETE /api/employees/{id}
         Delete an employee by their ID.
        Replace <employee_id> with the actual employee ID.
        curl -X DELETE http://localhost:8080/api/employees/<employee_id>

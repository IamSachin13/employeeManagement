

# Patient Appointment System
## Overview
A web-based application for managing patient registrations, appointments, and medications. Built with Spring Boot, Thymeleaf, and MongoDB, it provides an intuitive interface for booking appointments and tracking medications.

## Features
### Patient Registration:
Register new patients with their details.
### Appointment Booking:
Book appointments with a calendar picker and dropdown to select patients. Duplicate appointments are prevented.
### Medication Management:
Add and view medications with a dropdown to select patients.
## Technologies Used
    Backend: Spring Boot, Spring Data MongoDB, Spring MVC
    Frontend: Thymeleaf, HTML5, Bootstrap 5
    Database: MongoDB
    Build Tool: Maven
## Setup Instructions
    1.Clone the Repository:

    git clone https://github.com/IamSachin13/employeeManagement
    cd patient-appointment-system

2.Configure MongoDB:

    Update src/main/resources/application.properties:
    spring.data.mongodb.uri=mongodb://localhost:27017/patientdb

3.Build and Run:
bash

    1.mvn clean install
    2.mvn spring-boot:run

4.Access the Application:
    Open http://localhost:8080 in your browser.
## Usage
    1.Home Page:
        Navigate using the menu to access Patient Registration, Appointments, and Medications.
    2.Appointments:
        Use the calendar picker to select a date/time and a dropdown to choose a patient.
    3.Medications:
        Add medications by selecting a patient from the dropdown.
## Future Enhancements
    1.Integrate Spring Security for authentication.
    2.Enhance validations and notifications.
    3.Expand REST API endpoints for mobile integration.

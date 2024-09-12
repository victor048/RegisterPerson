*RegisterPerson Application*

**Overview**

The RegisterPerson Application is a simple CRUD (Create, Read, Update, Delete) web application built using Spring Boot. It allows users to manage a list of people, each associated with a gender and birthdate. The application is styled using Twitter Bootstrap and uses Flyway for database migrations.

Features
- Add, edit, delete, and view persons.
- Each person has an associated gender and birthday.
- Validation of fields (name, birthday, gender).
- Gender options are predefined (Male and Female).
- Simple responsive design using Bootstrap.
- Uses H2 in-memory database (can be configured to use other databases).
- Flyway for schema migrations.
- Spring Boot Actuator for application health monitoring.

**Technologies Used**
- Java 17 (or later)
- Spring Boot 3.x
Spring Web
Spring Data JPA
Spring Boot Actuator
Spring Validation
H2 Database (for development)
Thymeleaf (for view templating)
Lombok (for reducing boilerplate code)
Flyway (for database migrations)
Maven (for dependency management)
Bootstrap 4 (for frontend design)

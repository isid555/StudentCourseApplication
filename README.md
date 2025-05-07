# Student and Course Management System

## Overview
This project implements a Student and Course Management System using Spring Boot, JPA, JSP, and a relational database (MySQL or H2). The system allows users to perform basic CRUD operations (Create, Read, Update) on Student and Course entities. It includes forms for adding new students, displaying all students, and editing student details. The system also features a custom query that joins Student and Course to fetch students based on course names.

## Features
1. Create Operation: Allows adding new students to the database via a form.

2. Read Operation: Displays a list of all students along with the courses they are enrolled in.

3. Update Operation: Enables updating details for existing students, including course enrollment.

## Technologies Used
Java 11

Spring Boot (Spring MVC, Spring Data JPA)

JPA (Java Persistence API) for ORM

MySQL / H2 Database

JSP (Java Server Pages) for views

Thymeleaf (optional, for alternate templating)

## Architecture
This project follows a Layered Architecture:

Controller Layer: Manages HTTP requests and responses.

Service Layer: Contains business logic and interacts with the repository layer.

Repository Layer: Handles interactions with the database via JPA.

Entity Layer: Defines the Student and Course entities.


## Conclusion

This project demonstrates how to create a simple Student and Course Management System using Spring Boot and JPA. The application implements Create, Read, and Update operations with appropriate validation and exception handling.


## GitHub Repository

https://github.com/isid555/StudentCourseApplication

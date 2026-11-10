# SpringJDBC

A beginner-friendly Java project demonstrating database operations using Spring JDBC and JdbcTemplate.

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Spring JDBC
- JdbcTemplate
- H2 Database
- Maven

## ✨ Features

- Create and manage Alien records
- Insert data into database
- Retrieve records using SQL queries
- Perform database operations using JdbcTemplate
- Automatic database schema initialization

## 📂 Project Structure

```text
SpringJDBC
├── src
│   └── main
│       ├── java
│       │   └── com.SpringJDBC
│       │       ├── SpringJdbcApplication.java
│       │       ├── Alien.java
│       │       └── AlienRepo.java
│       └── resources
│           ├── application.properties
│           ├── schema.sql
│           └── data.sql
├── pom.xml
└── README.md
```

## 🗄️ Database

This project uses an H2 in-memory database.

### Alien Table

| Column | Data Type |
|---|---|
| id | INT |
| name | VARCHAR |
| tech | VARCHAR |

## 🛠️ How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Make sure Java 21 is installed.
4. Run `SpringJdbcApplication.java`.
5. The application will initialize the H2 database automatically.

## 📚 Learning Objectives

- Understanding Spring JDBC
- Using JdbcTemplate
- Executing SQL queries in Java
- Connecting Java applications with databases
- Implementing Repository classes

## 👨‍💻 Author

Harsh

---

⭐ This project was created for learning and practicing Spring JDBC and database integration with Java.

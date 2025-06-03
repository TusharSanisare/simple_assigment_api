# Prime Number Checker API

A simple and clean REST API built using **Java** and **Spring Boot** that checks whether a given number is a **prime number** or not.

---

## Features

- Check if a number is a prime
- RESTful API endpoint
- Input validation and error handling
- Clean code with proper structure (Controller + Service)

---

## Tech Stack

- Java 17
- Spring Boot 3.x
- Maven

---

## Project Structure
```
demo/
├── src/
│ └── main/
│ └── java/
│ └── com.example.demo/
│ ├── DemoApplication.java // Entry point
│ ├── controller/
│ │ └── PrimeController.java // REST controller
│ └── service/
│ └── PrimeService.java // Business logic
├── pom.xml // Maven dependencies
```

---

## Getting Started

### Prerequisites
```
| Tool    | Version                                 |
|---------|-----------------------------------------|
| Java    | 17+                                     |
| Maven   | 3.6+                                    |
| IDE     | (Optional) IntelliJ / VS Code / Eclipse |
```
---

### Setup Instructions

**Clone or Download the Project**
```
git clone https://github.com/TusharSanisare/simple_assigment_api.git
cd prime-check-api
```
   
**Build the Project**
```
mvn clean install
Run the Application
mvn spring-boot:run
```

**The app will start at**
```
http://localhost:8080
```

**API Usage**
```
Endpoint
GET /api/is-prime?number={your_number}
```

**Query Parameter**
```
Name	Type	Required	Description
number	String The number to be checked
```

**Example Requests**
```
Request	Response
/api/is-prime?number=7	"Number 7 is a prime number."
/api/is-prime?number=10	"Number 10 is not a prime number."
/api/is-prime?number=abc	"Invalid number format."
/api/is-prime	"Missing 'number' query parameter."
```

**Testing the API**
```
Using Browser
http://localhost:8080/api/is-prime?number=11
```

**Using Postman**
```
Method: GET
URL: http://localhost:8080/api/is-prime?number=19
```

**Click Send**
```
Using Curl
curl "http://localhost:8080/api/is-prime?number=29"
```

**Error Handling**
Missing parameter: "Missing 'number' query parameter."
Invalid input (non-numeric): "Invalid number format."

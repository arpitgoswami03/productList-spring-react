# Product Management System Backend 

Product Management System is a backend service built to manage and provide product data through REST APIs. The application allows users or frontend applications to retrieve, add, update, and manage product information efficiently.

This project demonstrates how to build a backend API for product management, which can be used by web or mobile applications.

---

## Features

- Retrieve list of products
- Add new products
- Update product details
- Delete products
- Fetch product information by ID
- RESTful API endpoints for product management

---

## Tech Stack

- **Backend Framework:** Spring Boot
- **Language:** Java
- **Database:** MySQL / H2 (depending on configuration)
- **Build Tool:** Gradle
- **API Style:** RESTful APIs

---

## Project Structure

```text
ProductList_Backend
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com/example/productlist
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       └── model
│   │   │
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   └── static
│
└── pom.xml / build.gradle
```

---

## Getting Started

### 1️. Clone the repository

```bash
git clone https://github.com/rarestpreet/ProductList_Backend.git
```

### 2️. Open the project

Open the project in **IntelliJ IDEA** or **Spring Tool Suite** and import it as a **Maven** / **Gradle** project.

### 3️. Configure the database (optional)

Depending on your setup, configure database properties in:

- `src/main/resources/application.properties`

If you use **MySQL**, ensure the DB is running and credentials match your config.  
If you use **H2**, you can run with an in-memory DB (based on configuration).

### 4️. Run the application

Run the main Spring Boot application class.

The server will start at:

- `http://localhost:8080`

---

## Example API Endpoints

| Method | Endpoint          | Description         |
|-------:|-------------------|---------------------|
| GET    | `/products`       | Get all products    |
| GET    | `/products/{id}`  | Get product by ID   |
| POST   | `/products`       | Add new product     |
| PUT    | `/products/{id}`  | Update product      |
| DELETE | `/products/{id}`  | Delete product      |

> Note: Request/response payloads depend on your `model` fields (e.g., `name`, `price`, `description`, etc.).

---

## Learning Objectives

This project helps developers understand:

- Building REST APIs using Spring Boot
- Implementing CRUD operations
- Working with backend architecture (Controller → Service → Repository)
- Connecting backend APIs with frontend applications

---

## Future Improvements

- Authentication and authorization (JWT)
- Pagination and filtering
- Product search functionality
- API documentation using Swagger / OpenAPI
- Docker support for deployment

---

## Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Open a pull request

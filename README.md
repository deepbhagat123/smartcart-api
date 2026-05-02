# Product Service — SmartCart Microservices

Part of the SmartCart retail backend system, inspired by Walmart's product catalog architecture.

## Overview
Product Service manages the product catalog for SmartCart. It handles full CRUD operations for products and serves as the source of truth for product and inventory data.

## Tech Stack
- Java 17
- Spring Boot 3.5
- Spring Data JPA / Hibernate
- MySQL 9.6
- Maven

## Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /products | Get all products |
| GET | /products/{id} | Get product by ID |
| POST | /products | Create new product |
| PUT | /products/{id} | Update product |
| DELETE | /products/{id} | Delete product |

## Architecture
- Runs on port 8081
- Database: smartcart
- Called by Order Service to validate stock before order placement
- Global exception handling with @ControllerAdvice
- Input validation with @Valid and Bean Validation

## How to Run
1. Make sure MySQL is running and smartcart database exists
2. Run SmartcartApiApplication.java
3. Test via Postman

## Related Repo
- [Order Service](https://github.com/deepbhagat123/order-service)

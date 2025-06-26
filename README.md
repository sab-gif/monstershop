# Monster Shop Backend

## Requirements
- Java 21
- Maven
- MySQL

## Setup

1. Clone the repository
2. Configure `src/main/resources/application.properties` with your MySQL credentials
3. Run `mvn clean install`
4. Start the backend: `mvn spring-boot:run`
5. Test endpoints with Postman

## Endpoints

- `GET /api/products`
- `GET /api/products/{id}`
- `POST /api/products`
- `PUT /api/products/{id}`
- `DELETE /api/products/{id}`
- `GET /api/reviews/{productId}`
- `POST /api/reviews?productId={id}`

## CORS

After Postman validation, enable CORS in `CorsConfig.java`.

# Smart Transfer API

A small Spring Boot project for learning Java backend development through a banking transfer use case.

The API accepts a transfer request, maps the JSON request into a Java object, and returns the request data through a REST endpoint.

## Current Features

- Spring Boot application setup
- REST API endpoint
- JSON request handling
- Transfer request model
- Postman testing
- Basic project structure

## API Endpoint

### Validate Transfer

**POST**

`/api/transfers/validate`

Example request:

```json
{
  "sourceAccountId": "10001",
  "destinationAccountId": "20002",
  "amount": 500.00,
  "currency": "USD",
  "availableBalance": 1000.00
}

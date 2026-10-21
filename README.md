# Smart Transfer API

A small Spring Boot project for learning Java backend development through a banking transfer use case.

The API accepts a transfer request, applies basic validation rules, and returns a transfer decision through a REST endpoint.

## Current Features

- Spring Boot application setup
- REST API endpoint
- JSON request handling
- Transfer request model
- Transfer validation service
- Transfer decision enum
- Validation for invalid amount
- Validation for same source and destination account
- Validation for insufficient balance
- Postman testing

## API Endpoint

### Validate Transfer

**POST**

`/api/transfers/validate`

### Example Request

```json
{
  "sourceAccountId": "10001",
  "destinationAccountId": "20002",
  "amount": 500.00,
  "currency": "USD",
  "availableBalance": 1000.00
}
```

### Example Response

```json
{
  "approved": true,
  "decision": "APPROVED",
  "message": "Transfer is valid"
}
```

## Validation Rules

The API currently checks:

- Transfer amount must be greater than zero
- Source and destination accounts must be different
- Available balance must be enough for the transfer

## What I Learned

- How a Spring Boot REST API works
- How JSON request data maps to a Java object
- How controllers handle API requests
- How a service class contains business logic
- How Java `if` statements are used for validation rules
- How enums can represent fixed decision values
- How Spring dependency injection connects the controller and service
- How to test API behavior using Postman

## Tech Stack

- Java 21
- Spring Boot
- Maven
- REST API
- Postman

## Next Steps

- Add validation for missing request fields
- Add unit tests
- Improve error handling
- Add AI-assisted explanations for transfer decisions

## Project Goal

This project is part of my hands-on journey from API design into Java backend engineering, Spring Boot, distributed systems, and AI integration.

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

### Example Request

{
  "approved": true,
  "decision": "APPROVED",
  "message": "Transfer is valid"
}


### Validation Rules
The API currently checks:
- Transfer amount must be greater than zero
- Source and destination accounts must be different
- Available balance must be enough for the transfer


So the order is:

```text
Current Features
      ↓
API Endpoint
      ↓
Example Request
      ↓
Example Response
      ↓
Validation Rules

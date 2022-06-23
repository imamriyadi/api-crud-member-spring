## Base url

```
https://api-crud-member-spring.herokuapp.com/v1
```

## Table endpoints

### Customer

| Name                 | Endpoint                                                    | Method   | Body and response                |
|----------------------|-------------------------------------------------------------|----------|----------------------------------|
| Create customer      | `/customer`                                                 | `POST`   | [example](#create-customer)      |
| Get All Customer     | `/customer`                                                 | `GET`    | [example](#get-all-customer)     |
| Get customer By id    | `/customer/by-id/{id}`                                      | `GET`    | [example](#get-customer-by-id)   |
| Get customer By name  | `/customer/customer/by-id/{name}`                           | `GET`    | [example](#get-customer-by-name) |
| Update Customer      | `/customer/{id}` | `PUT`    | [example](#update-customer)      |
| Delete Customer      | `/customer/{id}` | `DELETE` | [example](#delete-customer)      |

## Create Customer

Request :

- Method : POST
- Endpoint : `/customer`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json 
{ 
    "name" : "string",
    "age" : "integer",
    "gender" : "integer"
}
```

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
        }
    ]
}
```

## Get All Customer

Request :

- Method : GET
- Endpoint : `/customer`
- Header :
  - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
        }
    ]
}
```

## Get Customer By id

Request :

- Method : GET
- Endpoint : `/customer/by-id/{id}`
- Header :
  - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
        }
    ]
}
```

## Get Customer By Name

Request :

- Method : GET
- Endpoint : `/customer/by-name/{name}`
- Header :
  - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
        }
    ]
}
```

## Update Customer

Request :

- Method : PUT
- Endpoint : `/customer/{id}`
- Header :
  - Content-Type: application/json
  - Accept: application/json
- Body :

```json 
{
     "name" : "string",
     "age" : "integer",
     "gender" : "integer"
}
```

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
    } 
}
```

## Delete Customer

Request :

- Method : DELETE
- Endpoint : `/customer/{ids}`
- Header :
  - Accept: application/json

Response :

```json 
{
    "code" : "boolean",
    "status" : "string",
    "data" : [
        {
          "id" : "string, unique",
          "name" : "string",
          "age" : "integer",
          "gender" : "integer"
        }
    ]
}
```
# Makersharks Manufacturer Search API (Proof of Concept)

## Overview

This project is a Proof of Concept (POC) for a search API that allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes. The API is built using Spring Boot and operates without a database, using an in-memory data store for the purpose of this POC.

## Features

- Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.
- Simulated in-memory data for quick testing and demonstration.
- RESTful API endpoint to query suppliers.

## Requirements

- Java 8 or above
- Maven 3.6.3 or above

## Project Structure

```plaintext
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── makersharks/
│   │           ├── Dealer/
│   │           │   └── DealerApplication.java
│   │           ├   └── Supplier.java
│   │           │   └── SupplierController.java
│   │           ├   └── SupplierQueryRepo.java
│   │           │   └── SupplierService.java
│   │           └    
│   │                
│   └── resources/
│       └── application.properties
└── test/
    └── java/

```
# Installation
- Clone The Repository
- mvn Install
- mvn Spring-boot:run
- The API now Should be Running at localhost http://localhost:8090/suppliers

## If You are using CURL
- the json parameters :

```
curl -X POST http://localhost:8090/suppliers \
     -H "Content-Type: application/json" \
     -d '{"id": 4, "name": "New Supplier", "website": "https://newsupplier.com", "location": "Germany", "natureOfBusiness": "small_scale", "manufacturingprocess": "Coating"}'

 ```

 
 
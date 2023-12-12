# Product Service

Welcome to the Product Service of our E-Commerce System. This Java-based microservice is responsible for managing product-related information, including creation, editing, and association with specific stores.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)

## Overview

The Product Service is a Java-based microservice that handles product-related functionalities within our e-commerce system. It communicates with other microservices to ensure a seamless shopping experience.

## Prerequisites

Ensure you have the following installed:

- OpenJDK 17
- Apache Maven
- Kafka (for event-driven communication)
- MySQL 8

## Installation

1. Clone the repository.
2. Navigate to the product-service directory.
   ```bash
   cd product-service
   ```
3. Build the project using Maven.
   ```bash
   mvn clean install
   ```

## Usage

1. Set up environment variables for configuration.
   - Check the `.env.example` file for guidance.
   - Create a `.env` file and add the necessary configuration.

2. Start the Product Service.
   ```bash
   java -jar target/product-service.jar
   ```

3. Ensure the Kafka server is running to enable event-driven communication.

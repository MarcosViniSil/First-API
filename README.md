# First-API
## Class Diagram

```mermaid
classDiagram
  class User {
    -String name
    -String email
    -Product[] products
  }

  class Product {
    -String name
    -Number code
    -Number price
  }

  User "1" *-- "N" Product
```
## Documenting API using Swagger
<p align="center">

  <img src="https://github.com/MarcosViniSil/First-API/blob/main/images/swagger1.PNG" alt="swagger documentation1">
</p>
<p align="center">

  <img src="https://github.com/MarcosViniSil/First-API/blob/main/images/swagger2.PNG" alt="swagger documentation2">
</p>
<p align="center">

  <img src="https://github.com/MarcosViniSil/First-API/blob/main/images/swagger3.PNG" alt="swagger documentation3">
</p>

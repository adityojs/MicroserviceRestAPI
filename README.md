# MicroserviceRestAPI & Docker
Microservice Rest API & Docker

Port : 8080
Docker Version : 4.19
DB : Mysql
Name DB : API
User DB : root
Password DB : root

Get All :
localhost:8080/api/products
Get By Id :
localhost:8080/api/products/1
Post Create :
localhost:8080/api/products
{
    "name" : "Product 5",
    "description" : "Deskripsi Product ke 5",
    "price" : 500
}
Delete : 
localhost:8080/api/products/3
{
    "id": 4,
    "name": "Product 4",
    "description": "Deskripsi Product ke 4",
    "price": 300.0
}
Put :
localhost:8080/api/products
{
        "id": 2,
        "name": "Product 2x",
        "description": "Deskripsi Product ke 2x",
        "price": 220
    }

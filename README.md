# MicroserviceRestAPI, Docker & Swagger
Microservice Rest API, Docker, Swagger

Port : 8080
Docker Version : 4.19
DB : Mysql
openjdk:20
Name DB : API
User DB : root
Password DB : root

Langkah-langkah Menjalankan Microservice:
1. Clone Aplikasi Microservice dengan cara copy clone Http nya
2. Setelah Clone, Running Aplikasi Microservice
3. Setelah Running Aplikasi Microservice, copy paste "Using generated security password: 4e0ae96f-9cc1-4f0e-a243-7656ce6059da (ini hanya Contoh karena setiap Running Aplikasi Microservice akan berubah2)"
4. Build Dockerfile dengan perintah : "docker run -d -p 8080:8080 springapi" lalu mendapatkan key copy paste key tersebut ke perintah "docker rm ...(copy paste ke titik tersebut)", lalu cek perintah "docker container ls"
5. Setelah itu bisa test melalui web dengan ketik perintah "http://localhost:8080/product-ui.html" lalu isikan username: user dan password: 4e0ae96f-9cc1-4f0e-a243-7656ce6059da (ini hanya Contoh karena setiap Running Aplikasi Microservice akan berubah2)
6. Bisa test melalu Postman, dengan memasukan Authorization type Basic Auth lalu isikan username: user dan password: 4e0ae96f-9cc1-4f0e-a243-7656ce6059da (ini hanya Contoh karena setiap Running Aplikasi Microservice akan berubah2)
7. Dibawah ini Test-test yang mau di Ujikan sebagai berikut: get All, get By Id, Post Create, Delete, & Put


Get All :
localhost:8080/api/users
Get By Id :
localhost:8080/api/users/1
Post Create :
localhost:8080/api/users
{
    "name" : "Product 5",
    "description" : "Deskripsi Product ke 5",
    "price" : 500
}
Delete : 
localhost:8080/api/users/3
{
    "id": 4,
    "name": "Product 4",
    "description": "Deskripsi Product ke 4",
    "price": 300.0
}
Put :
localhost:8080/api/users
{
        "id": 2,
        "name": "Product 2x",
        "description": "Deskripsi Product ke 2x",
        "price": 220
    }

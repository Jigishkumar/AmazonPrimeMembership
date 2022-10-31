# AmazonPrimeMembership

created Jigishkumar Diwakar

This is an AmazonPrimeMembership back-end system, created using Java Spring Boot, that could be linked to a front-end to make API calls to a customer database. It has various CRUD (Create, Read, Update, Delete) functionalities to maintain the system and keep it updated. It is split into two tables. A table for membershiptype and a table for customers. This system is designed for Amazon to make it more convenient for them store, update and maintain customer data as well as membershiptype data. This README provides an overview of its functionality as well as instructions on how to run it using Spring Boot.

## Tools
+ Eclipse IDE
+ Java
+ Maven
+ Spring Boot
+ MySQL
+ Postman
+  GitHub



## Features

## MembershipTypes
+ Add membershiptype
+ View all membershiptypes
+ Update membershiptype
+ Delete membershiptype
+ View membershiptype by ID
+ View membershiptype by name
## Customers
+ Add customer
+ View all customers
+ Update customer by ID
+ Delete customer by ID
+ View customer by ID

## Project Structure

Below is an outline of the project structure:

![AmazonPrimeMembershipProject](https://user-images.githubusercontent.com/72922356/198732269-a68c5d9b-f374-4675-89fb-77a724c4f9ff.jpg)

## Membershiptype

Below is an ERD diagram for the Membershiptypes tables:

![ERD diagram](https://user-images.githubusercontent.com/72922356/198735631-9a6eafab-e9fb-4cdc-9910-07387912a431.jpg)

### Execution using Postman - CRUD


### As you can see the tables can be linked together through the MembershipTypeID

###  Execution using Postman - CRUD:

![addCustomer](https://user-images.githubusercontent.com/72922356/198745349-d495ed77-0398-4d4a-bd86-519925044815.jpg)

![updateCustomer](https://user-images.githubusercontent.com/72922356/198745405-80857203-cab3-4b44-bf0b-c08641dfd3c9.jpg)

![CustomerfindbyId](https://user-images.githubusercontent.com/72922356/198745663-a1873f84-c1a4-4e37-9264-8d13a92abd25.jpg)

![deleteCustomerById](https://user-images.githubusercontent.com/72922356/198745699-6391c730-4e9c-4ff4-bd5a-57d697b30a48.jpg)

![addmembershiptype](https://user-images.githubusercontent.com/72922356/198745734-b77d895c-e0ca-4b64-9ac0-fa0558c314fe.jpg)

![AllMembershipType](https://user-images.githubusercontent.com/72922356/198745785-2428275d-582a-4411-9c2b-4cefb0779b11.jpg)


![addmembershiptype](https://user-images.githubusercontent.com/72922356/198745389-33dd227b-6c6d-4ef9-9589-8bd9135cd02a.jpg)

![deleteMembershipType](https://user-images.githubusercontent.com/72922356/198745801-83b9850e-3a3c-4abe-a54e-2279a349f694.jpg)

## Executing on Spring Boot:

Since this is a Spring Boot application it uses a TomCat server.
The port number used is 8080, so make sure that port remains free.
Once you have opened the project, you can right click and there two was to run it:
1. Run as Java Application
2. Run as Spring Boot App

After this you can run the CRUD operations using something like Postman as shown above.

## Testing


As you can see on the picture below, different types of tests were carried out on the functionality of the system and were pass.
These were done using Mockito and JUnit testing.

![Test](https://user-images.githubusercontent.com/72922356/198746673-4a3e772e-b245-4c75-a6d4-cb9d28dbc93f.jpg)

![TestError](https://user-images.githubusercontent.com/72922356/198746682-461f5617-432e-4283-942e-993c8e333be4.jpg)

What I learned from this project:

In this project I learned how to use various Java and Spring Boot functionalities including LOMBOK, JUnit testing and being able to create a back-end API that can perform CRUD operations. I expected this to be quite challenging as it was the first time I did something like this and it was also done under a quick deadline. In the future, if given more time, I would add more operations to the CRUD functions and try to designa front-end as well.























# mono2micro-masterclass-class01
Monolithic Applcation to Micro Services Applications - Class 01/05

Main Objective: Creation of a Monolithic Travel Order Application

Pre requistes:
JAVA 21 Installed

Quarkus Extensions Used on Project:
RestEasy Reactive - quarkus-resteasy
RestEasy Reactive JSON-B - quarkus-resteasy-jsonb
Hibernate ORM - quarkus-hibernate-orm3
Hibernate ORM with Panache - quarkus-hibernate-orm-panache
JDBC Driver - H2 - quarkus-jdbc-h2
Lombok - 1.18.36

Some Commands for Testing Application:

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

Testing Applcation:

############### TRAVEL ORDER ############################

Listing Travel Orders: 
curl localhost:8080/travelorder 

Find a Travel Order: 
curl localhost:8080/travelorder/findById?id=1 

Insert a new Travel Order: 
curl -d "{}" -H "Content-Type: application/json" http://localhost:8080/travelorder

Delete a Travel Order:
curl localhost:8080/travelorder/deleteById?id=1

############### FLIGHT ############################

List Flights: 
curl localhost:8080/flight 

Find a Flight: 
curl localhost:8080/flight/findById?id=1 

Insert a new Flight: 
curl -d "{\"travelOrderId\": \"1\", \"sourceAirport\": \"GRU\", \"destinyAirport\": \"SDU\"}" -H "Content-Type: application/json" http://localhost:8080/flight

Delete a Flight:
curl localhost:8080/flight/deleteById?id=1
 
############### HOTEL ############################

List Hotels: 
curl localhost:8080/hotel 

Find a Hotel: 
curl localhost:8080/hotel/findById?id=1 

Insert a new Hotel: 
curl -d "{\"travelOrderId\": \"2\", \"nights\": \"10\"}" -H "Content-Type: application/json" http://localhost:8080/hotel 

Delete a Hptel:
curl localhost:8080/hotel/deleteById?id=1
# mono2micro-masterclass-class01
Monolithic Applcation to Micro Services Applications - Class 01/05

Main Objective: Creation of a Monolithic Application - Travel Order App

Some Commands for Testing Application:

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

Testing Applcation:

Listing Travel Orders: 
curl localhost:8080/travelorder 

Finding a Travel Order: 
curl localhost:8080/travelorder/findById?id=1 

Inserting a new Travel Order: 
curl -d "{}" -H "Content-Type: application/json" http://localhost:8080/travelorder 

Listing Flights: 
curl localhost:8080/flight 

Finding a Flight: 
curl localhost:8080/flight/findById?id=1 

Inserting a new Flight: 
curl -d "{\"travelOrderId\": \"1\", \"sourceAirport\": \"GRU\", \"destinyAirport\": \"SDU\"}" -H "Content-Type: application/json" http://localhost:8080/flight
 

Listing Hotels: 
curl localhost:8080/hotel 

Finding a Hotel: 
curl localhost:8080/hotel/findById?id=1 

Inserting a new Hotel: 
curl -d "{\"travelOrderId\": \"2\", \"nights\": \"10\"}" -H "Content-Type: application/json" http://localhost:8080/hotel 

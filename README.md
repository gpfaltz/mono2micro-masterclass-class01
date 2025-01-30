# mono2micro-masterclass-class01
Monolithic Applcation to Micro Services Applications - Class 01/05

Main Objective: Creation of a Monolithic Application - Travel Order App

Some Commands for Testing Application:

Starting Application:
./mvnw quarkus:dev
./mvnw clean quarkus:dev

Testing Applcation:

curl localhost:8080/travelorder
curl localhost:8080/travelorder/findById?id=1
curl -d "{}" -H "Content-Type: application/json" http://localhost:8080/travelorder

curl localhost:8080/flight
curl localhost:8080/flight/findById?id=1
curl -d "{\"travelOrderId\": \"1\", \"sourceAirport\": \"GRU\", \"destinyAirport\": \"SDU\"}" -H "Content-Type: application/json" http://localhost:8080/flight

curl localhost:8080/hotel
curl localhost:8080/hotel/findById?id=1
curl -d "{\"travelOrderId\": \"2\", \"nights\": \"10\"}" -H "Content-Type: application/json" http://localhost:8080/hotel
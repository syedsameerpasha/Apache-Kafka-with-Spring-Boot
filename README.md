Apache-Kafka-with-Spring-Boot

A hands-on Spring Boot project demonstrating how Zomato/Swiggy implement live delivery partner location tracking using Apache Kafka.
This repository contains two microservices:

1️⃣ DeliveryBoy Service (Kafka Producer)
2️⃣ EndUser Service (Kafka Consumer)

Both work together to simulate real-time location streaming.

🚴 1. DeliveryBoy Service (Producer)

This service represents a delivery partner sending location updates.

✔ Features

Publishes live latitude/longitude to Kafka

Kafka Producer implementation

REST endpoint to trigger location updates

Simulates continuous streaming (like Zomato rider location refresh)


👤 2. EndUser Service (Consumer)

This service represents the customer side.

✔ Features

Consumes location messages from Kafka

Always receives the latest rider location

Can be extended to show the coordinates on a UI/map

Kafka Consumer implementation


🛠 Tech Stack

Java 17

Spring Boot

Apache Kafka (Local / Docker)

Spring Kafka

REST APIs

JSON

🧵 Kafka Topic

delivery_location_topic

Used to carry continuous delivery partner location updates.


⚙️ Architecture
DeliveryBoy Service (Producer)
        |
        V
     Kafka Topic
        |
        V
EndUser Service (Consumer)

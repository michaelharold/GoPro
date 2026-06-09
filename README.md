# GoPro - Travel Booking Platform

A full-stack travel booking web application built with **Spring Boot** and **Firebase**. GoPro lets users plan a complete trip in one place: search and book flights, trains, buses, and hotels - with built-in budget planning.

## Features

- **User authentication** - sign up / log in backed by Firebase
- **Flight booking** - search and select flights
- **Train booking** - search and select trains
- **Bus booking** - search and select buses
- **Hotel booking** - find and book accommodation
- **Budget planning** - set a trip budget and track it across bookings
- **Booking confirmation** - end-to-end booking flow with confirmation page

## Tech Stack

- **Backend:** Java 17, Spring Boot 3.5 (Web, Security), Maven
- **Database / Auth:** Firebase (Admin SDK)
- **Frontend:** Static HTML/CSS/JS served from `src/main/resources/static`

## Project Structure

```
src/main/java/com/GoPRO/GoPRO/
  controller/   # REST controllers: Auth, Flight, Train, Bus, Hotel, Budget
  service/      # Business logic per booking type + Firebase service
  entity/       # DTOs and entities (User, Budget, FlightDTO, TrainDTO, ...)
  config/       # Firebase configuration
  SecurityConfig.java
src/main/resources/static/   # Frontend pages (index, selection pages, confirmation)
```

## Getting Started

1. **Prerequisites:** JDK 17+, a Firebase project with a service-account key
2. Place your Firebase service-account JSON where `FirebaseConfig` expects it (do not commit it)
3. Run:

```bash
./mvnw spring-boot:run
```

4. Open `http://localhost:8080` in your browser

## API Overview

| Controller | Purpose |
|---|---|
| `AuthController` | User registration / login |
| `FlightController` | Flight search and booking |
| `TrainController` | Train search and booking |
| `BusController` | Bus search and booking |
| `HotelController` | Hotel search and booking |
| `BudgetController` | Trip budget management |

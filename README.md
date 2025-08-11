A Java application demonstrating core Object-Oriented Programming concepts through a digital media rating system.

## About the Application

This console application simulates a media platform that allows users to:

- Track Music: Store artist, album, and genre details
- Manage Podcasts: Record host information and descriptions
- Rate Content: Automatically calculate ratings based on plays/likes
- Generate Recommendations: Classify media as "the heat!" or "good one!"


## Key Features

- Media Management
- Music tracking (artist, album, genre)
- Podcast tracking (host, description)
- Play counter simulation
- Like counter simulation


## Rating System

- Dynamic rating calculation:
  - Music: Based on play count (>1000 plays = 10/10)
  - Podcasts: Based on like count (>500 likes = 10/10)

- Personalized recommendations via MyFavorites class

## Technologies

Core Implementation:
- Language: Java
- Paradigm: Object-Oriented Programming (OOP)


## OOP Concepts Demonstrated

- Inheritance (Audio superclass)
- Polymorphism (overridden getRating())
- Encapsulation (private attributes with accessors)
- Abstraction (base media structure)

# Quiz Rest

> Spring Application that creates REST APIs for Quiz and the Topic modules.

- Each Quiz contains set of Topics. So Topics->Quiz **(ManyToOne Mapping)**

> The application was connected to PostgresSQL Database.

## REST APIs for Quiz:

- GET - localhost:8080/quiz - To get all the quizzes
- GET - localhost:8080/quiz/comp102 - To get a single quiz
- POST - localhost:8080/quiz - Create a Quiz
- PUT - localhost:8080/quiz/comp102 - Edit a single quiz
- DELETE - localhost:8080/quiz/mat203 - Delete a Quiz

## REST APIs for Topics:

- GET - localhost:8080/quiz/bio102/topics - Get all topics in the particular quiz
- GET - localhost:8080/quiz/bio102/topics/cell101 - Get a topic under particular quiz
- POST - localhost:8080/quiz/bio102/topics - Create a topic under a quiz
- PUT - localhost:8080/quiz/bio102/topics/cell101 - Edit a topic under the quiz
- DELETE - localhost:8080/quiz/bio102/topics/cell101 - Delete a topic under a quiz

> Spring Data Actuator was used to do the health check of the application.
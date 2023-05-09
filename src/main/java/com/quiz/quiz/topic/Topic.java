package com.quiz.quiz.topic;

import com.quiz.quiz.quizTest.Quiz;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="topic")
public class Topic {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Quiz quiz;

    public Topic() {
    }

    public Topic(String id, String name, String description, String quizId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quiz = new Quiz(quizId, "", "");
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

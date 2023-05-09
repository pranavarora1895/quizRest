package com.quiz.quiz.quizTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuiz() {
        List<Quiz> quiz = new ArrayList<>();
        quizRepository.findAll().forEach(quiz::add);
        return quiz;
    }

    public Quiz getQuizById(String id) {
        return quizRepository.findById(id).get();
    }

    public void createQuiz(Quiz quizItem) {
        quizRepository.save(quizItem);
    }

    public void editQuiz(String id, Quiz quizItem) {
        quizRepository.save(quizItem);
    }

    public void deleteQuiz(String id) {
        quizRepository.deleteById(id);
    }
}

package com.quiz.quiz.quizTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    private QuizService quizService;

    @RequestMapping("/quiz")
    public List<Quiz> getAllQuiz() {
        return quizService.getAllQuiz();
    }

    @RequestMapping("/quiz/{id}")
    public Quiz getQuiz(@PathVariable String id) {
        return quizService.getQuizById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/quiz")
    public void createQuiz(@RequestBody Quiz quiz) {
        quizService.createQuiz(quiz);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/quiz/{id}")
    public void editQuiz(@PathVariable String id, @RequestBody Quiz quiz) {
        quizService.editQuiz(id, quiz);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "quiz/{id}")
    public void deleteQuiz(@PathVariable String id) {
        quizService.deleteQuiz(id);
    }
}

package com.quiz.quiz.topic;

import com.quiz.quiz.quizTest.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/quiz/{quizId}/topics")
    public List<Topic> getAllTopics(@PathVariable String quizId) {
        return topicService.getAllTopics(quizId);
    }

    @RequestMapping("/quiz/{quizId}/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopicById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/quiz/{quizId}/topics")
    public void createTopic(@RequestBody Topic topic, @PathVariable String quizId) {
        topic.setQuiz(new Quiz(quizId, "", ""));
        topicService.createTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/quiz/{quizId}/topics/{id}")
    public void editTopic(@PathVariable String id, @PathVariable String quizId,@RequestBody Topic topic) {
        topic.setQuiz(new Quiz(quizId, "", ""));
        topicService.editTopic(topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/quiz/{quizId}/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}

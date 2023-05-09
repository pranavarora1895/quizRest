package com.quiz.quiz.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(String id) {
        List<Topic> topic = new ArrayList<>();
        topicRepository.findTopicByQuizId(id).forEach(topic::add);
        return topic;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findById(id).get();
    }

    public void createTopic(Topic quizItem) {
        topicRepository.save(quizItem);
    }

    public void editTopic(Topic quizItem) {
        topicRepository.save(quizItem);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}

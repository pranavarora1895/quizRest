package com.quiz.quiz.topic;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {

    public List<Topic> findTopicByQuizId(String quizId);
}

package com.greenfox.exam.spring.model;

import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

  QuestionList questionList;
  QuestionRepository questionRepository;

  @Autowired
  public QuestionService(QuestionList questionList, QuestionRepository questionRepository){
    this.questionList = questionList;
    this.questionRepository = questionRepository;
  }

  public List<Question> getQuestions() {
    List<Question> questList = new ArrayList<>();
    Iterable questions = questionRepository.findAll();
    for (Object question : questions) {
      questList.add(((Question) question));
    }
    return questList;
  }

}

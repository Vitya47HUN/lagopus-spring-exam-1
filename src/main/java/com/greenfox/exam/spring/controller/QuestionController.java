package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.AnswerList;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class QuestionController {
  QuestionRepository questionRepo;
  QuestionList questionList;

  @Autowired
  public QuestionController(QuestionRepository questionRepo){
    this.questionList = new QuestionList();
    this.questionRepo = questionRepo;
  }

  @RequestMapping(path = "/questions", method = RequestMethod.GET)
  public Object getQuestions(){
    questionList.setQuestions((List<Question>) questionRepo.findAll());
    Collections.shuffle(questionList);
    return questionList;
  }

  @RequestMapping(path = "/answers", method = RequestMethod.POST)
  public Object giveAnswers(@RequestBody AnswerList answerList){
    return questionList;
  }

}

package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

  @Autowired
  QuestionRepository questionRepo;
  QuestionList questionList = new QuestionList();
  Question questionOne = new Question("What is the color code of Green Fox?");
  Question questionTwo = new Question("When was Green Fox founded?(yyyy.mm.)");


  @RequestMapping(path = "/questions", method = RequestMethod.GET)
  public Object getQuestions(){
    questionRepo.save(questionOne);
    questionRepo.save(questionTwo);
    questionList.setQuestionss(questionRepo.findAll());
    return questionList;
  }
}

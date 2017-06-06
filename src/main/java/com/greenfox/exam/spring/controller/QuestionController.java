package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Answer;
import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

  @Autowired
  QuestionRepository questionRepo;
  QuestionList questionList = new QuestionList();
//  Question questionOne = new Question("What is the color code of Green Fox?");
//  Question questionTwo = new Question("When was Green Fox founded?(yyyy.mm.)");
//  Question questionThree = new Question("What type of dog Barbi has?");
//  Question questionFour = new Question("When did your course start?");
//  Question questionFive = new Question("What is HerrNorbert's favourite color?");


  @RequestMapping(path = "/questions", method = RequestMethod.GET)
  public Object getQuestions(){
    questionList.setQuestions(questionRepo.findAll());
    return questionList;
  }

  @RequestMapping(path = "/answer", method = RequestMethod.POST)
  public Object giveAnswers(@RequestBody Answer answer){

    return questionList;
  }

}

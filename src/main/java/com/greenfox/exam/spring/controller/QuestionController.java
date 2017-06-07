package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.AnswerList;
import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.service.QuestionRandomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

  @Autowired
  QuestionRepository questionRepo;

  @Autowired
  QuestionList questionList;

  @Autowired
  QuestionRandomizer generator;


  @RequestMapping(path = "/questions", method = RequestMethod.GET)
  public QuestionList getQuestions() {
    generator.generateRandomQuestion(questionList);

//    questionList.setQuestions((List<Question>) questionRepo.findAll());

    return questionList;
  }

  @RequestMapping(path = "/answers", method = RequestMethod.POST)
  public Object giveAnswers(@RequestBody AnswerList answerList) {
    for(int i =0;i < questionList.getQuestions().size();i++){
      if (questionList.getQuestions().get(i).getAnswer().equals(answerList.getAnswers().get(i).getAnswer())){
        System.out.println("OK");
      } else {
        System.out.println("NOT OK");
      }
    }
    return questionList;
  }
}

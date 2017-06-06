package com.greenfox.exam.spring.controller;

import com.greenfox.exam.spring.model.Question;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

  @RequestMapping(path = "/questions", method = RequestMethod.POST)
  public Object getQuestions(@RequestBody Question question) {
    return question;
  }
}

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

import java.util.Random;

@RestController
public class QuestionController {

  @Autowired
  QuestionRepository questionRepo;

  @Autowired
  QuestionList questionList;

  @RequestMapping(path = "/questions", method = RequestMethod.GET)
  public QuestionList getQuestions() {

    questionRepo.save(new Question("What is the color code of Green Fox?"));
    questionRepo.save(new Question("When was Green Fox founded?(yyyy.mm.)"));
    questionRepo.save(new Question("When did your course start?"));
    questionRepo.save(new Question("What type of dog Barbi has?"));
    questionRepo.save(new Question("What is HerrNorbert's favourite color?"));
    questionRepo.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
    questionRepo.save(new Question("How many mentors teach at Green Fox at this moment?"));
    questionRepo.save(new Question("What was the name of the first Green Fox class?"));
    questionRepo.save(new Question("How many likes do we have on facebook?"));
    questionRepo.save(new Question("What is Tojas's horoscope?"));

    for (int i = 0; i < 5; i++) {
      if (questionList.getQuestions().size() == 5) {
        return questionList;
      } else {
        long x = 1L;
        long y = 10L;
        Random r = new Random();
        long number = x + ((long) (r.nextDouble() * (y - x)));
        if (questionList.getQuestions().contains(questionRepo.findOne(number))) {
          r = new Random();
          number = x + ((long) (r.nextDouble() * (y - x)));
          questionList.addQuestion(questionRepo.findOne(number));
        } else {
          questionList.addQuestion(questionRepo.findOne(number));
        }
      }
    }
    return questionList;
  }

  @RequestMapping(path = "/answers", method = RequestMethod.POST)
  public Object giveAnswers(@RequestBody AnswerList answerList){
    return answerList;
  }
}

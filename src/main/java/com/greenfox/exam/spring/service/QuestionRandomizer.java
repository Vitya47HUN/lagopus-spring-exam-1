package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.QuestionList;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class QuestionRandomizer {

  @Autowired
  QuestionRepository questionRepo;

  public QuestionList generateRandomQuestion(QuestionList questionList) {

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
}


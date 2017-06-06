package com.greenfox.exam.spring.model;


import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Component
public class QuestionList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private Iterable<Question> questions;

  public QuestionList(Iterable<Question> questions) {
    this.questions = questions;
  }

  public QuestionList(){
    this.questions = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Iterable<Question> getQuestionss() {
    return questions;
  }

  public void setQuestionss(Iterable<Question> questionss) {
    this.questions = questionss;
  }
}

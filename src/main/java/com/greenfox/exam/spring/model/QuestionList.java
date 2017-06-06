package com.greenfox.exam.spring.model;


import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.ArrayList;

@Component
public class QuestionList {

  @Id
  private long id;
  private Iterable<Question> questions;

  public QuestionList(Iterable<Question> questions) {
    this.questions = questions;
  }

  public QuestionList(){
    this.questions = new ArrayList<>();
    this.id = 1;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Iterable<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(Iterable<Question> questions) {
    this.questions = questions;
  }
}

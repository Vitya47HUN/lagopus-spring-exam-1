package com.greenfox.exam.spring.model;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class QuestionList {

  @Id
  private long id;
  private List<Question> questions;

  public QuestionList(List<Question> questions) {
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

  public Question getQuestions(Integer i) {
    return questions.get(i);
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

}

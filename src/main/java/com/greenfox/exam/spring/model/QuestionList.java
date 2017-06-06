package com.greenfox.exam.spring.model;


import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Component
public class QuestionList {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private List<Question> question;

  public QuestionList(List<Question> question) {
    this.question = question;
  }

  public QuestionList(){
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Question> getQuestion() {
    return question;
  }

  public void setQuestion(List<Question> question) {
    this.question = question;
  }
}

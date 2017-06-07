package com.greenfox.exam.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  String question;

  public Question(){
  }

  public Question(String question) {
    this.question = question;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }
}

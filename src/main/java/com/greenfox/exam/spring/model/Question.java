package com.greenfox.exam.spring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  String question;

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @JsonIgnore
  String answer;

  public Question(){
  }

  public Question(String question,String answer) {
    this.question = question;
    this.answer = answer;
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

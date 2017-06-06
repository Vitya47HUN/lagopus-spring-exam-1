package com.greenfox.exam.spring.model;

import org.springframework.stereotype.Component;

import javax.persistence.Id;
import java.util.List;

@Component
public class AnswerList {

  @Id
  private long id;
  private List<Answer> answers;

  public AnswerList() {
    this.answers = answers;
    this.id = 1;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Iterable<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}

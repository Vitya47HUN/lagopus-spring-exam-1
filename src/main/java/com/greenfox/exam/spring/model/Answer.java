package com.greenfox.exam.spring.model;
import javax.persistence.*;

@Entity
@Table(name = "Questions")
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String answer;

  public Answer(String answer) {
    this.answer = answer;
  }

  public Answer(){}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }
}

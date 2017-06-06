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
  private List<Question> questionList;

  public QuestionList(List<Question> questionList) {
    this.questionList = questionList;
  }

  public QuestionList(){
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public List<Question> getQuestionList() {
    return questionList;
  }

  public void setQuestionList(List<Question> questionList) {
    this.questionList = questionList;
  }

  public void addQuestion(Question question){
    questionList.add(question);
  }
}

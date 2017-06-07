package com.greenfox.exam.spring;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepo;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		questionRepo.save(new Question("What is the color code of Green Fox?"));
		questionRepo.save(new Question("When was Green Fox founded?(yyyy.mm.)"));
		questionRepo.save(new Question("When did your course start?"));
		questionRepo.save(new Question("What type of dog Barbi has?"));
		questionRepo.save(new Question("What is HerrNorbert's favourite color?"));
		questionRepo.save(new Question("How many classes are learning at Green Fox Academy at this moment?"));
		questionRepo.save(new Question("How many mentors teach at Green Fox at this moment?"));
		questionRepo.save(new Question("What was the name of the first Green Fox class?"));
		questionRepo.save(new Question("How many likes do we have on facebook?"));
		questionRepo.save(new Question("What is Tojas's horoscope?"));
	}
}

package in.co.examsadda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.co.examsadda.util.TestUtil;

@SpringBootApplication
public class ExamsAddaApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ExamsAddaApplication.class, args);
		System.out.println("Application started");
		TestUtil testUtil= new TestUtil();
		testUtil.saveExam();
		
	}

	
}

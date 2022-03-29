package learn.JPA.Basic_JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;




@SpringBootApplication
public class BasicJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appcontex =SpringApplication.run(BasicJpaApplication.class, args);
		System.out.println("       Bean       :"+appcontex.containsBean("Bean1"));
		System.out.println("       Bean       :"+appcontex.containsBean("Bean2"));
	}
	
	

}

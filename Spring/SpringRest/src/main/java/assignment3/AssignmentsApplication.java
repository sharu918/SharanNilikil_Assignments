package assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"assignment3.ZipService"})
public class AssignmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentsApplication.class, args);
	}

}

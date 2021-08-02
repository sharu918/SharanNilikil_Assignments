package assignment5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
@ComponentScan("assignment5.EmployeeDAO")
public class AssignmentsApplication implements CommandLineRunner {

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(AssignmentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("All employees -> {}",dao.findAll());
		logger.info("Inserting an employee in Employee table ->{}",
				dao.insert(new Employee(918,"Sharan","DATA MANAGEMENT","DATA PROCESSOR",20000)));
		
		logger.info("employees 918 -> {}",dao.findById(918));
		logger.info("delete employees 102 -> {}",dao.findById(102));
		
	}

}

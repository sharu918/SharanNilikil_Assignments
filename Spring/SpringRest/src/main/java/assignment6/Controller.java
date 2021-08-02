package assignment6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/home")
	public String home()
	{
		return "welcome to home page";
	}
	
	@GetMapping("/calculate")
	public int operation()
	{
		return 15;
	}
}

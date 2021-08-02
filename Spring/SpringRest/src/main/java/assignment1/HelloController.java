package assignment1;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hi")
	public String getData()
	{
		return "Hello World";
	}
}

package assignment3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private ZipService zip;

	@GetMapping("/")
	public String home() {
		return "Hello World!";
	}

	@PostMapping("/courses")
	public String home2() {
		return "hi";
	}

	public List<Zipcodedata> getCourses() {
		return this.zip.getZips();

	}

	@GetMapping("/zip/{zip}")
	public Zipcodedata getzipInfo(@PathVariable String zip) {
		return this.zip.getZips(Long.parseLong(zip));
	}
}

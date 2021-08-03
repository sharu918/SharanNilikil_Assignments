package assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	UserModel obj;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String sayHello() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String sayHello2(@RequestParam String user, @RequestParam String pass, @RequestParam String email,
			ModelMap model) {
		if (obj.User(user, pass, email)) {
			return "success";
		} 
		else {
			return "error";
		}
	}
}
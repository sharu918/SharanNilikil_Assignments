package assignment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SIController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	// @ResponseBody
	public String sayHello() {
		return "simpleinterest";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String sayG(@RequestParam String principal, @RequestParam String rate, @RequestParam String time,
			ModelMap model) {
		float p = Float.parseFloat(principal);
		float r = Float.parseFloat(rate);
		float t = Float.parseFloat(time);
		float res = p * r * t;
		model.put("result", res);

		return "result";
	}
}

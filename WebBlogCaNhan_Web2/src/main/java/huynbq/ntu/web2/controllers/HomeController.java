package huynbq.ntu.web2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/blog/home")
	public String home() {
		return "views/home";
	}
}

package soo.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("index.html")
	public String index2() {
		return "index";
	}
	
	@GetMapping("about.html")
	public String about() {
		return "about";
	}
	@GetMapping("blog.html")
	public String blog() {
		return "blog";
	}
	@GetMapping("codes.html")
	public String codes() {
		return "codes";
	}
	@GetMapping("contact.html")
	public String contact() {
		return "contact";
	}
	@GetMapping("menu.html")
	public String menu() {
		return "menu";
	}
	@GetMapping("single.html")
	public String single() {
		return "single";
	}
	
}

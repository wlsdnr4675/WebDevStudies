package soo.bs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
	@GetMapping( "/")
	public String index() {
		return "index";
	}
	@GetMapping( "/index.html")
	public String index2() {
		return "index";
	}
	
	@GetMapping ("about.html")
	public String about() {
		return "about";
	}
	@GetMapping ("blog.html")
	public String blog() {
		return "about";
	}
	@GetMapping ("codes.html")
	public String codes() {
		return "about";
	}
	@GetMapping ("contact.html")
	public String contact() {
		return "about";
	}
	@GetMapping ("menu.html")
	public String menu() {
		return "about";
	}
	@GetMapping ("single.html")
	public String single() {
		return "about";
	}
	
}

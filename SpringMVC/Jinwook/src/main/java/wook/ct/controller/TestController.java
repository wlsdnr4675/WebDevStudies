package wook.ct.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequestMapping("/test/*")
public class TestController {
	
	@RequestMapping("/")
	public void m01 () {
		System.out.println("M01()");
	}
	@RequestMapping("/base1")
	public void m02() {
		System.out.println("M02()");
	}
	
	@RequestMapping(value = "/base2", method=RequestMethod.GET )
	public void m03() {
		System.out.println("M03()");
	}
	
	@RequestMapping(value = "/base3", method= {RequestMethod.GET, RequestMethod.POST } )
	public void m04() {
		System.out.println("M04()");
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String form() {
		
		return "test/form";
	}

	
	

}

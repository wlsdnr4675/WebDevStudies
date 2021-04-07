package wook.md.controller;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import lombok.extern.log4j.Log4j;
import wook.md.domain.Human;
import wook.md.domain.HumanList;

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
	@RequestMapping(value="/param1")
	public void m05(/*@RequestParam*/ String name, /*@RequestParam*/ int age) {
		
		System.out.println("m05() name: " + name + ", age: "+ age);
	}
	@RequestMapping(value="/param2")
	public void m06(Human dto) {
		
		System.out.println("m06() name: " + dto.getName() + ", age: "+ dto.getAge());
	}
	@RequestMapping(value="/param3")
	public void m07(@RequestParam ArrayList<String> name) {
		
		System.out.println("m06() name: ");
	}
	@RequestMapping(value="/param4")
	public void m08(Human dto) {
		
		System.out.println("m06() name: " + dto.getName() + ", age: "+ dto.getAge());
	}
	@RequestMapping(value="/param6")
	public void m10(@RequestParam HumanList list) {
		
		log.info("m10() names: " + list);
		
	}
	@RequestMapping(value="/param7")
	public void m11(Human dto, int page) {
		
		log.info("m06() name: " + dto.getName() + ", age: "+ dto.getAge() +" page: "+ page);
	}
	@GetMapping ("/json1" )
	public ResponseEntity<String> m12() {
		String msg = "{\"name\":\"슬기\",\"age\":24}";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content_type", "application/json;charset=urf-8");
		
		return new ResponseEntity<>(msg,headers,HttpStatus.OK);

	}
	
	@GetMapping ("json2" )
	public @ResponseBody Human m13() {
		return new Human("진욱",27);
 	}
	
	@GetMapping ("txt" )
	public @ResponseBody String m14() {
		return "txt";
 	}

	
	
}

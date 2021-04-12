package soo.md.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import soo.md.filesetting.Path;
import soo.md.service.FileUploadService;



@Log4j
@RequestMapping("file")
@Controller
@AllArgsConstructor // autoInjection( spring 4.3 이후 )
public class FileController {
	
	private FileUploadService service;
	
	@GetMapping("form.do")
	public String form() {
		
		return "file/form"; 
	}
	
	@PostMapping("upload.do")
	public String upload(@RequestParam String name, @RequestParam MultipartFile file) {
		
		String ofname = file.getOriginalFilename();
		if(ofname != null) ofname = ofname.trim();
		if(ofname.length() != 0) {
			String url =  service.saveStore(file);
			log.info("#UPLOAD URL: " + url); 
		}
		return "redirect:list.do";
	}
	@GetMapping("list.do")
	public ModelAndView fileList() {
		File fStore=  new File(Path.FILE_STORE);
		if(!fStore.exists()) fStore.mkdirs();
		File files [] = fStore.listFiles();
		
		
		ModelAndView mv = new ModelAndView("file/list","files", files);
		
		return mv;
	}
	
	@GetMapping("del.do")
	public String del(String fname) {
		File file =  new File(Path.FILE_STORE, fname);
		if(file.exists()) file.delete();
		
		
		return "redirect:list.do";
	}
	
}

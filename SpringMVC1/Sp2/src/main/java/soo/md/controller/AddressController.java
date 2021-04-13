package soo.md.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.log4j.Log4j;
import soo.md.domain.Address;
import soo.md.domain.AddressFile;
import soo.md.service.AddressService;
import soo.md.service.FileUploadService;


@Log4j
@Controller
@RequestMapping("/address/*")
public class AddressController {
	@Autowired
	private AddressService addressService;

	
	@GetMapping("list.do")
	public ModelAndView list() {
		List<Address> list = addressService.listS();
		
		/*ModelAndView mv = new ModelAndView();
		mv.setViewName("address/list"); //View
		mv.addObject("list", list); //Model 
		*/
		ModelAndView mv = new ModelAndView("address/list", "list", list);
		
		return mv;
	}
	@GetMapping("write.do")
	public String write() {
		return "address/write";
	}
	@PostMapping("write.do")
	public String write(Address address, @RequestParam ArrayList<MultipartFile> files) {
		log.info("#name: " + address.getName() + ", addr: " + address.getAddr());
		ArrayList<AddressFile> uploadedFileList = null;
		
		
		for(MultipartFile file: files) {
			String ofname = file.getOriginalFilename();
			if(ofname != null) ofname = ofname.trim();
			if(ofname.length() != 0) {
				log.info("================== file start ==================");
	            log.info("파일 이름: "+file.getName());
	            log.info("파일 실제 이름: "+file.getOriginalFilename());
	            log.info("파일 크기: "+file.getSize());
	            log.info("content type: "+file.getContentType());
	            log.info("================== file   END ==================");
	            

		}
	}
		try {
			uploadedFileList =  addressService.insertS(address, files);
		}
		catch (Exception e) {
			addressService.removeFiles();
			}
		
		log.info("uploadedFileList: " + uploadedFileList);
		
				
		return "redirect:list.do";
	}
	@GetMapping("del.do")
	public String delete(long seq) {
		addressService.removeFiles(seq);
		addressService.deleteS(seq);
		return "redirect:list.do";
	}
}




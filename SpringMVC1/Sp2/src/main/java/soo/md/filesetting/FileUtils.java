package soo.md.filesetting;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Component("FileUtils")
@Log4j
public class FileUtils {
	 @Autowired
	 private String uploadPath;
	
	public List<Map<String, Object>> parseFileInfo( ArrayList<MultipartFile> files) throws Exception {
		
		List<Map<String,Object>> fileList = new ArrayList<Map<String, Object>>();
		File target =  new File(uploadPath);
		if(!target.exists()) target.mkdirs();
		for(MultipartFile file : files) {
		String ofname = file.getOriginalFilename();
		int idx = ofname.lastIndexOf(".");
		String ofheader = ofname.substring(0,idx);
		String ext = ofname.substring(idx);
		long ms = System.currentTimeMillis();
		
		// 스트링 저장소 이다 
		StringBuilder sb = new StringBuilder();
		sb.append(ofheader);
		sb.append("_");
		sb.append(ms);
		sb.append(ext);
		String saveFileName = sb.toString();
		
		long fsize = file.getSize();
		
		log.info("================== file start ==================");
        log.info("파일 실제 이름: "+ofname);
        log.info("파일 저장 이름: "+saveFileName);
        log.info("파일 크기: "+fsize);
        log.info("content type: "+file.getContentType());
        log.info("================== file   END ==================");
        
        target = new File(uploadPath, saveFileName);
        file.transferTo(target);
		Map<String, Object> fileInfo = new HashMap<String, Object>();
		
		fileInfo.put("OFNAME", ofname);
		fileInfo.put("SFNAME", saveFileName);
		fileInfo.put("FSIZE", fsize);
		
		fileList.add(fileInfo);
		
		
		}
        
		
		return fileList;
		
			
}

}

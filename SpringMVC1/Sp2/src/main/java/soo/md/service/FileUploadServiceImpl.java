package soo.md.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;
import soo.md.filesetting.*;

@Log4j
@Service
public class FileUploadServiceImpl  implements FileUploadService{

	@Override
	public String saveStore(MultipartFile file) {
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
		log.info("#ofname: " +ofname + " #saveFileName: " + saveFileName +" #fileSize: " + fsize);
		boolean flag =  writeFile(file, saveFileName); 
		if(flag) {
			log.info("#업로드 성공 ");
		}else {
			log.info("#업로드 실패 ");
		}
		
		return Path.FILE_STORE +saveFileName;
	}

	@Override
	public boolean writeFile(MultipartFile file, String saveFileName) {
		// TODO Auto-generated method stub
		File dir = new File(Path.FILE_STORE); // 저장소 경로 객체 
		if(dir.exists()) dir.mkdirs();
		
		FileOutputStream fos = null;
		try {
			
			byte data[] = file.getBytes();
			fos = new FileOutputStream(Path.FILE_STORE +saveFileName);
			fos.write(data);
			fos.flush();
			
			return true;
			
			}catch(IOException ie) {
				
				return false;
				
		}finally {
			
			try {
				if(fos != null) fos.close();
			}
			catch (IOException ie) {
				// TODO: handle exception
			}
		}
	}

}

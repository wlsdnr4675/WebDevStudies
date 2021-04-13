package soo.md.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import soo.md.domain.Address;
import soo.md.domain.AddressFile;

public interface AddressService {
	List<Address> listS();
	//void insertS(Address address)
	ArrayList<AddressFile> insertS(Address address, ArrayList<MultipartFile> files);
	void deleteS(long seq);
	
	
	void removeFiles(long seq);
	void removeFiles();
	
}

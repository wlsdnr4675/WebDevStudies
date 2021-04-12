package soo.md.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import soo.md.dao.AddressDao;
import soo.md.domain.Address;
import soo.md.filesetting.Path;
import soo.md.mapper.AddressMapper;

@Log4j
@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {
	
	private AddressMapper addressMapper;
	//private AddressDao addressDao;
	private AddressServiceImpl service;
	
	@Override
	public List<Address> listS() {
		//return addressDao.list();
		return addressMapper.list();
	}

	@Override
	public void insertS(Address address) {
		//addressDao.insert(address);
		addressMapper.insert(address);
	}

	@Override
	public void deleteS(long seq) {
		//addressDao.delete(seq);
		addressMapper.delete(seq);
	}


}

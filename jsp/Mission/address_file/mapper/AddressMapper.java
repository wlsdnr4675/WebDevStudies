package soo.md.mapper;

import java.util.List;
import soo.md.domain.Address;
import soo.md.domain.AddressFile;

public interface AddressMapper {
	List<Address> list();
	//void insert(Address address);
	
	void delete(long seq);
	List<AddressFile> fileListForRemove(long seq);
	
	void insertSelectKey(Address address);
	void insertF(AddressFile addressFile);
}

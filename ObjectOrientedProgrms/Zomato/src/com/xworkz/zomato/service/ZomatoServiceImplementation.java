package com.xworkz.zomato.service;

import com.xworkz.zomato.dto.ZomatoDto;
import com.xworkz.zomato.repository.ZomatoRepository;

public class ZomatoServiceImplementation implements ZomatoService {

	private ZomatoRepository repository;

	public ZomatoServiceImplementation(ZomatoRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(ZomatoDto zomatodto) {
		boolean validateCustumerName = true;
		boolean validateCustumerEmail = true;
		boolean validateCustumerContactNumber = true;
		boolean validatfoodItemName = true;
		boolean validateCostOfTheItem = true;
	if (zomatodto != null) {
			System.out.println("dto is not null");

			if (zomatodto.getCustumerName() == null
					|| (zomatodto.getCustumerName().length() 
							<3 || zomatodto.getCustumerName().length() > 40)) {
				System.out.println("get custumer name is running");
				validateCustumerName = false;
			}
			long contactnumber = zomatodto.getContactNumber();
			int count = 0;
			while (contactnumber > 0) {
				contactnumber = contactnumber / 10;
				count++;
			}
			if (count != 10) {
				System.out.println("contact number is wrong");
				validateCustumerContactNumber = false;
				
			}
			if (!(zomatodto.getCustumerEmail().contains("@")) || zomatodto.getCustumerEmail() == null) {
				System.out.println("email is containing @");
				validateCustumerEmail = false;
			}
			if (zomatodto.getCostOfTheItem() != 0) {
				validateCostOfTheItem = false;
			}
//	if(validateCustumerEmail && validateCustumerContactNumber && validatfoodItemName
//		&& validateCostOfTheItem) {
		
			if (validateCustumerName&&validateCustumerEmail  ) {
	
				boolean exist = isExist(zomatodto);
				if (exist == false) {
					boolean save = repository.onsave(zomatodto);
					if (save) {
					
						System.out.println("Saved successfully");
						return true;
					} else {
						System.out.println("not saved sucessfully");
						return false;
					}
				}
			}}
		
		return false;

	}

	@Override
	public void read() {
		ZomatoDto[] dto = repository.read();
		// if(dto!=null) {
		for (ZomatoDto zomatoDto : dto) {
			// if(zomatoDto!=null) {

			System.out.println(zomatoDto);
			// }
			// }
		}
	}

	@Override
	public boolean update(String custumerEmail, ZomatoDto zomatoDto) {
		boolean update = repository.update(custumerEmail, zomatoDto);
		if (update) {
			System.out.println("updated successfully");
			return true;
		} else {
			System.out.println("not updated sucessfully");
		}
		return false;
	}

	@Override
	public boolean delete(long contactNumber) {
		if (contactNumber != 0) {
			boolean delete = repository.delete(contactNumber);
			if (delete) {
				System.out.println("deleted successfully");
				return true;
			} else {
				System.out.println("not deleted sucessfully");
			}
		}
		return false;
	}

	private boolean isExist(ZomatoDto zomatodto) {
		ZomatoDto[] exists = repository.read();
		if (exists != null) {
			for (ZomatoDto zomato : exists) {
				if (zomato != null) {
					if (zomato.equals(zomatodto)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
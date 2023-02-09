package com.xworkz.bakery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.Repository.BakeryRepository;
import com.xworkz.bakery.dto.BakeryDTO;
@Service
public class BakeryServiceImpl implements BakeryService {
@Autowired
	private BakeryRepository repository;

public BakeryServiceImpl() {
	System.out.println("Running : " + getClass().getSimpleName());
}
	@Override
	public boolean validationAndSave(BakeryDTO dto) {
		System.out.println("Runner validateAndSave in BakeryServiceImpl");
		boolean saved=this.repository.save(dto);
		return false;
	}

}

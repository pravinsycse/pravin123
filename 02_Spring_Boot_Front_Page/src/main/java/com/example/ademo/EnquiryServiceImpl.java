package com.example.ademo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnquiryServiceImpl implements EnquiryService {
	
	@Autowired
	private EnquiryDao enquiryDao;

	@Override
	public List<Enquiry> getAllEnquires() {
		return enquiryDao.findAll();
	}
	

}

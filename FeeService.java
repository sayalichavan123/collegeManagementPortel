package com.mydata.service;

import java.util.List;

import com.mydata.model.Fee;

public interface FeeService {

	Fee saveFee(Fee fee);
	
	List<Fee>viewallfeedetails();
	
	Fee getfeebyid(int id);
	
	void deletefeedetailsbyid(int id);
	
	Fee updateFee(Fee fee);
	
	
}

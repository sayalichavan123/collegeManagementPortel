package com.mydata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mydata.Repository.FeeRepository;
import com.mydata.model.Fee;

@Service
public class FeeServiceimpl implements FeeService {
	@Autowired
	FeeRepository feeRepository;

	@Override
	public Fee saveFee(Fee fee) {
		return feeRepository.save(fee);
	}

	@Override
	public List<Fee> viewallfeedetails() {
		return feeRepository.findAll();
	}

	@Override
	public Fee getfeebyid(int id) {
		return feeRepository.findById(id).get();
	}

	@Override
	public void deletefeedetailsbyid(int id) {
		feeRepository.deleteById(id);
	}

	@Override
	public Fee updateFee(Fee fee) {
		return feeRepository.save(fee);
	}

	

}

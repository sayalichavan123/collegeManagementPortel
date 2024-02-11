package com.mydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mydata.model.Fee;
import com.mydata.service.FeeService;

@Controller
public class FeeController {
	@Autowired
	FeeService feeService;

	@GetMapping("/addfee")
	public String openaddfeeform(Model model) {
		Fee addfee = new Fee();
		model.addAttribute("Feedetails", addfee);
		return "addfee.html";

	}

	@PostMapping("/addfee")
	public String addfeefetails(@ModelAttribute("Feedetails") Fee fee) {
		feeService.saveFee(fee);
		return "addfee.html";
	}

	@GetMapping("/viewall")
	public String showallfeedetails(Model model) {
		List<Fee> flist = feeService.viewallfeedetails();
		model.addAttribute("viewallfeedetails", flist);
		return "fees.html";

	}

	@GetMapping("/delete/{id}")
	public String deletefeedetailsbyid(@PathVariable int id) {
		feeService.deletefeedetailsbyid(id);
		return "redirect:/viewall";

	}

	@GetMapping("/fee/edit/{id}")
	public String openEditFeeForm(@PathVariable int id, Model model) {
		Fee getfeebyid = feeService.getfeebyid(id);
		model.addAttribute("updatefee", getfeebyid);
		return "updatefee.html";
	}

	@PostMapping("/fee/edit/{id}")
	public String updatefee(@PathVariable int id, @ModelAttribute("updatefee") Fee fee, Model model) {
		Fee existingfeedetails = feeService.getfeebyid(id);
		existingfeedetails.setRollNo(id);
		existingfeedetails.setName(fee.getName());
		existingfeedetails.setPaidFee(fee.getPaidFee());
		existingfeedetails.setCatagory(fee.getCatagory());
		existingfeedetails.setRemainingFee(fee.getRemainingFee());
		existingfeedetails.setStatus(fee.getStatus());
		existingfeedetails.setTotalFee(fee.getTotalFee());
		feeService.saveFee(existingfeedetails);
		return "redirect:/viewall";

	}

}

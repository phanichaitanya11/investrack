package com.investrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investrack.beans.FixedDepositbean;

@Controller
public class NewInvestmentController {

	@RequestMapping(value = "/newFixedDeposits", method = RequestMethod.GET)
	public String displayNewFixedDeposits(Model model) {
		FixedDepositbean deposit = new FixedDepositbean();
		model.addAttribute("newFDForm", deposit);
		return "newFixedDeposit";
	}
}

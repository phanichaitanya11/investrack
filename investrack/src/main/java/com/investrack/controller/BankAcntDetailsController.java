package com.investrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investrack.beans.BankBean;
import com.investrack.service.BankAcntDetailsService;

@Controller
public class BankAcntDetailsController {

	@Autowired
	private BankAcntDetailsService bankAcntDetailsService;
	
	@RequestMapping(value = "/addBankAccount", method = RequestMethod.GET)
	public String displayAddBankAcntDetails(Model model) {
		BankBean bankBean = new BankBean();
		model.addAttribute("bankAcntDetailsForm", bankBean);
		return "addBankAccount";
	}
	
	@RequestMapping(value = "/addBankAccount", method = RequestMethod.POST)
	public String addNewBankAcntDetails(Model model, @ModelAttribute("bankAcntDetailsForm") BankBean bankBean) {
		if (bankBean != null) {
			if (bankAcntDetailsService.addAccount(bankBean)) {
				model.addAttribute("result", "success");
				model.addAttribute("msg", "Successfully added new bank account number : " + bankBean.getAccountNumber());
				model.addAttribute("bankAcntDetailsForm", bankBean);
				return "addBankAccount";
			} else {
				model.addAttribute("result", "error");
				model.addAttribute("msg", "An error occurred while adding new bank account details");
				model.addAttribute("bankAcntDetailsForm", bankBean);
				return "addBankAccount";
			}
		} else {
			model.addAttribute("result", "error");
			model.addAttribute("msg", "An error occurred while adding new bank account details");
			model.addAttribute("bankAcntDetailsForm", bankBean);
			return "addBankAccount";
		}
	}
}

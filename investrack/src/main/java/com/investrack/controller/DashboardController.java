package com.investrack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashboardController {

	@RequestMapping(value = "/dashboard")
	public String displayLogin(Model model) {
		return "index";
	}
}

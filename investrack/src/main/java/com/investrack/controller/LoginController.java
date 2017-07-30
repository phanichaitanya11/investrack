package com.investrack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investrack.beans.LoginBean;
import com.investrack.service.LoginService;
import com.investrack.utils.Utils;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String displayLogin(Model model) {
		LoginBean loginBean = new LoginBean();
		model.addAttribute("loginForm", loginBean);
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateUser(Model model,
			@ModelAttribute("loginBean") LoginBean loginBean) {
		if (loginBean != null
				&& Utils.trimString(loginBean.getUsername()) != null
				&& Utils.trimString(loginBean.getPassword()) != null) {
			if (loginService.validateUser(loginBean)) {
				model.addAttribute("result", "success");
				model.addAttribute("msg", loginBean.getUsername());
				model.addAttribute("loginForm", loginBean);
				return "redirect:/dashboard";
			} else {
				model.addAttribute("result", "error");
				model.addAttribute("msg", "Invalid Details!");
				model.addAttribute("loginForm", loginBean);
				return "login";
			}
		} else {
			model.addAttribute("result", "error");
			model.addAttribute("msg", "Please enter login credentials.");
			model.addAttribute("loginForm", loginBean);
			return "login";
		}
	}
}

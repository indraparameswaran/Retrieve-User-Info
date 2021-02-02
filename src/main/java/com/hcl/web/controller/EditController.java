package com.hcl.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.web.model.UserInfoEntity;
import com.hcl.web.service.EditService;

@Controller
public class EditController {

	@Autowired
	EditService service;
	private static Logger logger = LoggerFactory.getLogger(SearchController.class);
	
	@RequestMapping(value = "/useredit", method = RequestMethod.GET)
	public String showUserEdit(ModelMap model) {
		logger.info("Inside search User");
		model.addAttribute("userEdit", new UserInfoEntity());
		return "useredit";
	}

	@RequestMapping(value = "/useredit", method = RequestMethod.POST)
	public String processEdit(@ModelAttribute("userSearch") UserInfoEntity updateUser, ModelMap model) {
		logger.info("Inside processEdit fileName = EditController.java");
		if (!updateUser.equals(null) && updateUser.getFirstName() != "" && updateUser.getLastName() != ""
				&& updateUser.getEmail() != "" && updateUser.getLocation() != "") {
			service.updateUser(updateUser);
			return "userupdated";
		}

		logger.warn("BLANK TEXTFIELD DETECTED");
		model.addAttribute("update", "Please fill up all the field");
		return "useredit";

	}

}

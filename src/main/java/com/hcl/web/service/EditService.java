package com.hcl.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.web.controller.SearchController;
import com.hcl.web.model.UserInfoEntityCrudRepository;
import com.hcl.web.model.UserInfoEntity;

@Service
public class EditService {

	@Autowired
	UserInfoEntityCrudRepository userEntityCrudRepository;
	private static Logger logger = LoggerFactory.getLogger(SearchController.class);

	public boolean updateUser(UserInfoEntity user) {
		logger.info("Inside updateUser fileName = EditService.java");
		userEntityCrudRepository.save(user);
		return true;
	}
}

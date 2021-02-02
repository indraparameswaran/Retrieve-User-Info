package com.hcl.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.web.controller.SearchController;
import com.hcl.web.model.UserInfoEntityCrudRepository;
import com.hcl.web.model.UserInfoEntity;

@Service
public class SearchService {

	@Autowired
	UserInfoEntityCrudRepository userEntityCrudRepository;
	private static Logger logger = LoggerFactory.getLogger(SearchController.class);

	public boolean searchUser(UserInfoEntity user) {
		logger.info("Inside SearchUser fileName = SearchService.java");
		Long checkId = checkUser(user);
		if (checkId > 0L) {
			logger.warn("FOUND USER IN DATABASE WITH ID: " + checkId);
			userEntityCrudRepository.deleteById(checkId);
			return true;
		}
		logger.warn("CANNOT FIND USER IN THE DATABASE");
		return false;
	}

	public Long checkUser(UserInfoEntity user) {
		logger.info("Inside checkUser fileName = SearchService.java");
		Iterable<UserInfoEntity> listOfUsers = userEntityCrudRepository.findAll();
		for (UserInfoEntity userEntity : listOfUsers) {
			if (userEntity.getLastName().equalsIgnoreCase(user.getLastName())) {
				logger.warn("USER FOUND, RETURNING ID OF USER");
				return userEntity.getId();
			}
		}
		return 0L;
	}

}

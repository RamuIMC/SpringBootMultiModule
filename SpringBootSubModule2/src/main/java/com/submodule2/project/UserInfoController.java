package com.submodule2.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.submodule1.project.Service;

@RestController
public class UserInfoController {
	
	@Autowired
	Service service;
	
	@RequestMapping(value="/getMessage",produces={MediaType.APPLICATION_JSON_VALUE})
	public UserDto getMessage(){
		
		UserDto userDto = new UserDto();		
		userDto.setMessage(service.message());
		return userDto;
		
		
	}

}

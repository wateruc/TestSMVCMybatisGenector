package com.waterpc.test.testsmvcmbg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/userinfor")
public class UserInforController {

	@RequestMapping(value="/name",method=RequestMethod.GET)
	public String getUserName(){
		return "hellow";
	}
	
}

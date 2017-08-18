package org.framestudy.springmvc20170818.sysmag.controller;

import java.util.Arrays;
import java.util.Date;

import org.framestudy.springmvc20170818.pojos.Register;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/registers")
@Controller
public class RegisterController {

	
	
	
	
	@RequestMapping("/regist02")
	public ModelAndView regist(Register register) {
		System.out.println(register);
		
		ModelAndView mv = new ModelAndView("index");
		return mv;
		
	}
	
	@RequestMapping("/regist")
	public ModelAndView regist(String userName,Date birthday,int age,double income,boolean marry,String[] interest) {
		System.out.println(userName);
		System.out.println(age);
		System.out.println(birthday);
		System.out.println(income);
		System.out.println(marry);
		System.out.println(Arrays.toString(interest));
		
		ModelAndView mv = new ModelAndView("index");
		return mv;
		
	}
	
	
	
	
	
	
}

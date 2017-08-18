package org.framestudy.springmvc20170818.sysmag.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.framestudy.springmvc20170818.pojos.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/sys")//@RequestMapping 如果定义在类上面，代表为该类提供一个namespace
@Controller//将某一个JAVA类标记成表现层的组件
public class LoginController {
	
	
	@RequestMapping("/login09")
	public Map login(UserInfo user) {
		
		System.out.println(user);
		Map map = new HashMap();
		map.put("userName", "小马");//===request.setAttribute("userName","小马")
		
		return map;
	}
	
	
	
	@RequestMapping("/{id}/{loginName}/{password}")
	public void login(@PathVariable("id")Long id,@PathVariable("loginName")String loginName,@PathVariable("password")String password,PrintWriter out) {
		System.out.println(id);
		System.out.println(loginName);
		System.out.println(password);
		out.print(true);
	}
	
	
	
	@RequestMapping("/login07")
	public String login(UserInfo user,Map map, @RequestHeader("User-Agent") String agent) {
		System.out.println(user);
		System.out.println(agent);
		map.put("userName", "小马");//===request.setAttribute("userName","小马")
		return "layout/layout";
	}
	
	
	
	@RequestMapping("/login06")
	public String login(UserInfo user,HttpServletRequest req, @CookieValue("JSESSIONID") String jsessionid) {
		System.out.println(user);
		System.out.println(jsessionid);
		req.setAttribute("userName","小马");
		return "layout/layout";
	}
	
	
	@RequestMapping("/login05")
	public void login(UserInfo user,PrintWriter out) {
		System.out.println(user);
		out.print(true);
	}
	
	@RequestMapping("/login04")
	public String login(UserInfo user,Map map) {
		System.out.println(user);
		map.put("userName", "小马");//===request.setAttribute("userName","小马")
		return "layout/layout";
	}
	
	
	//value 规定请求的路径
	//method 规定后台方法可接收的页面方法类型，如果不匹配将抛出405 Request method 'GET' not supported
	//params 用来过滤参数，如果不匹配将抛出HTTP Status 400 - Parameter conditions 
	//"!loginName" not met for actual request parameters: loginName={sdfg}, password={123123123}
/*	@RequestMapping(value= {"/login03","/reg*"},method=RequestMethod.POST,params= {"loginName","password!=123456"})
	public ModelAndView login(UserInfo user) {
		System.out.println(user);
		//调用业务方法处理业务逻辑
		
		//向页面返回结果
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","小马");
		mv.setViewName("layout/layout");
		return mv;
	}*/
	
	//value="loginName" 用来完成页面提交项与形参之间的关联
	//required=true 表示必须要有loginName这个提交项
	//defaultValue 设置一个默认值
	@RequestMapping(value="/login02")
	public ModelAndView login(@RequestParam(value="loginName",required=true,defaultValue="无名氏")String name,String password) {
		System.out.println(name);
		System.out.println(password);
		
		//调用业务方法处理业务逻辑
		
		
		//向页面返回结果
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","小马");
		mv.setViewName("layout/layout");
		
		
		return mv;
	}
	
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest req,HttpServletResponse res,HttpSession session) {
		String loginName = req.getParameter("loginName");
		String password = req.getParameter("password");
		//调用业务方法处理业务逻辑
		
		
		//向页面返回结果
		ModelAndView mv = new ModelAndView();
		mv.addObject("userName","小马");
		mv.setViewName("layout/layout");
		
		
		return mv;
	}
	
	
	
	
}

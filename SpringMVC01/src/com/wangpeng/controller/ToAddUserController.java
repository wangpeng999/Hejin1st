package com.wangpeng.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.wangpeng.po.User;

public class ToAddUserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		
		
		mv.setViewName("add");
		
		return mv;
	}

}

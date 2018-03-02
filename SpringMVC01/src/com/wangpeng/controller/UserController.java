package com.wangpeng.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.wangpeng.po.User;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//接收请求参数，调用业务逻辑类方法，返回响应结果
		User user = new User();
		user.setUsername(request.getParameter("username"));
		user.setSex(request.getParameter("sex"));
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = sdf.parse(request.getParameter("birthday"));
		user.setBirthday(birthday);
		user.setAddress(request.getParameter("address"));
		
		
		//创建爱你ModelAndView对象，封装模型和视图返回
		ModelAndView mv = new ModelAndView();
		//封装模型数据
		mv.addObject("user",user);
		
		//封装实处返回物理视图
		//mv.setViewName("/WEB-INF/jsp/index");
		
		//封装视图返回逻辑视图
		/*<!-- 配置sprigmvc视图解析器：解析逻辑视图 后台返回逻辑试图：
		 * index 视图解析器解析出真正物理视图：
		 * 前缀+逻辑试图+后缀====/WEB-INF/
		 * jsps/index.jsp -->
		*/
		mv.setViewName("user");
		
		return mv;
	}

}

package com.wangpeng.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ProductController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("hello","欢迎访问商品功能");
		
		//封装实处返回物理视图
		//mv.setViewName("/WEB-INF/jsp/index");
		
		//封装视图返回逻辑视图
		/*<!-- 配置sprigmvc视图解析器：解析逻辑视图 后台返回逻辑试图：
		 * index 视图解析器解析出真正物理视图：
		 * 前缀+逻辑试图+后缀====/WEB-INF/
		 * jsps/index.jsp -->
		*/
		mv.setViewName("product");
		
		return mv;
	}

}

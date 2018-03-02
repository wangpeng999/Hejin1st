package com.wangpeng.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

public class HttpController implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 使用request参数就收请求，封装数据，返回响应（转发）
		request.setAttribute("hello", "这是实现HttpRequestHandler接口的HttpController");
		request.getRequestDispatcher("/WEB-INF/jsp/index.jsp").forward(request, response);
		//使用response重定向
	}

}

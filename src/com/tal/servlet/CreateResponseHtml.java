package com.tal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 生成Html模板的servlet
 * 
 * @author whfstudio@163.com
 * @d2017年1月22日
 */
public class CreateResponseHtml extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8209679321722610080L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}

package com.tal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����shell�ļ���ִ�в��Ե�servlet
 * 
 * @author �⺣��
 * @d2016��12��22��
 */
public class startCmdServlet extends HttpServlet {

	/**
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * ִ�нű��ļ������ɲ��Ա��棬��ҳ����ʾ���Ա���
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");

		/*
		 * $path1=$_POST["slaveip1"]; $path2=$_POST["slaveip2"];
		 * $path3=$_POST["slaveip3"]; $path4=$_POST["slaveip4"];
		 * $path6=$_POST["filepath"]; $path7=$_POST["radio"];
		 */

		/*
		 * ��ȡ��ҳ����
		 */
		String remoteIp_1 = request.getParameter("slaveip1");
		String remoteIp_2 = request.getParameter("slaveip2");
		String remoteIp_3 = request.getParameter("slaveip3");
		String remoteIp_4 = request.getParameter("slaveip4");
		String filePath = request.getParameter("filepath");

		String isRemote = request.getParameter("radio");

		System.out.println("�Ƿ����Զ�̲��ԣ�" + isRemote);

		try {
			int state = Runtime
					.getRuntime()
					.exec("./WEB-INF/data/ceshi.bat " + remoteIp_1 + " "
							+ remoteIp_2 + " " + remoteIp_3 + " " + remoteIp_4
							+ " " + filePath + " " + isRemote).waitFor();// ִ�нű��ļ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (isRemote.equals("true")) {
			response.getWriter().write("ִ��cmd������ɲ��Ա��棡");
		}

	}
}

<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
  </head>
  
  <body>
	<form action="uploadServlet" method="post"
		enctype="multipart/form-data">
		<%-- ����enctype��multipart/form-data���������԰��ļ��е�������Ϊ��ʽ�����ϴ���������ʲô�ļ����ͣ������ϴ���--%>
		��ѡ��Ҫ�ϴ����ļ�<input type="file" name="upfile" size="50"> <input
			type="submit" value="�ύ">
	</form>
</body>
</html>

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-02-02 07:52:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.*;
import dao.*;

public final class dynamic_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("dao");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("bean");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP 只允许 GET、POST 或 HEAD。Jasper 还允许 OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	/*------------------------------------------------------------------------------------------------
	修改人			     
	修改时间 	
	修改内容	
	版本号			 
	-------------------------------------------------------------------------------------------------*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Message.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"Css/Public_Color/orange.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Homepage.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body bgcolor=\"#F4F5F7\">\r\n");
      out.write("\t");

		String ID = request.getParameter("ID");//接收从dynamic.jsp页面form中传过来的ID
		//String ID = (String)request.getSession().getAttribute("ID");
		//System.out.println("$$$$$$$$$$$dynamic_details.jsp：" + ID);
		dynamicDao dynamic = new dynamicDao();
		Message head_message = (Message) request.getSession().getAttribute("head_message");
		Message message = head_message;
		//System.out.println("dynamic_details.jsp：" + message.content);
		String snumber = request.getParameter("detaili");
		//System.out.println(snumber);
		int number = Integer.parseInt(snumber);
		System.out.println(snumber);
		while (number-- > 1) {
			message = message.next;
		}
	
      out.write("\r\n");
      out.write("\t<form action=\"Homepage.jsp\" method=\"post\" name=\"form_ID\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<!-- form表单传值 -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "season.jsp", out, false);
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<div class=\"fenge\">\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"details\">\r\n");
      out.write("\t\t<div class=\"detail_content\">\r\n");
      out.write("\t\t\t<div class=\"title small-font light-font\">\r\n");
      out.write("\t\t\t\t&nbsp;>&nbsp;/&nbsp;活动&nbsp;/&nbsp;如何成为一个合格...</div>\r\n");
      out.write("\t\t\t<div class=\"title small-font light-font\" style=\"float: right;\">\r\n");
      out.write("\t\t\t\t<a href=\"Homepage.jsp\">返回&nbsp;&nbsp;&nbsp;&nbsp;</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"separator light-font\">\r\n");
      out.write("\t\t\t\t<span>------------------------------------------------------------------------------------------------------------------------------------------------</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"head\">\r\n");
      out.write("\t\t\t\t<div class=\"head_photo\">\r\n");
      out.write("\t\t\t\t\t<img class=\"small_head_photo\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"img/head_photo/");
      out.print(message.head_photo);
      out.write(".jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"border-radius: 25px;\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"title middle-font\">");
      out.print(message.title);
      out.write("</div>\r\n");
      out.write("\t\t\t\t<div class=\"nickname small-font light-font\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(message.nickiname);
      out.write("<span class=\"time\">");
      out.print(message.psotdate);
      out.write("</span>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<pre>");
      out.print(message.content);
      out.write("</pre>\r\n");
      out.write("\t\t\t\t");

					for (int j = 0; j < dynamic.getAllphotourl(message).size(); j++) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(message).get(j));
      out.write("\">\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"function\">\r\n");
      out.write("\t\t\t\t<div id=\"time\" style=\"width: 150px; height: 60px; margin-top: 10px;\">\r\n");
      out.write("\t\t\t\t\t<font id=\"samll\" style=\"font-size: 20px;\">");
      out.print(message.psotdate);
      out.write("</font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"like\" style=\"width: 150px; height: 60px;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/example/点赞.png\" id=\"good\" style=\"width: 45px;\">\r\n");
      out.write("\t\t\t\t\t<font id=\"samll\" style=\"font-size: 20px;\">");
      out.print(message.like);
      out.write("</font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"like\" style=\"width: 150px; height: 60px;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/example/收藏.png\" id=\"good\" style=\"width: 45px;\">\r\n");
      out.write("\t\t\t\t\t<font id=\"samll\" style=\"font-size: 20px;\">22</font>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"detail_list\">\r\n");
      out.write("\t\t\t<div class=\"title white-font\">所有消息</div>\r\n");
      out.write("\t\t\t<div class=\"list\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"xz\"><a href=\"#\">");
      out.print(head_message.title);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						while (head_message.next != null) {
							head_message = head_message.next;
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">");
      out.print(head_message.title);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");

						}
					
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-04-03 11:02:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Adminpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.Admin_tools;
import java.util.StringTokenizer;

public final class check_005fmission_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.Admin_tools");
    _jspx_imports_classes.add("java.util.StringTokenizer");
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Public_Color/orange.css\" />\r\n");
      out.write("<link href=\"../Css/Public_style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".firbox {\r\n");
      out.write("\twidth: 17%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tmargin-right: 0.1%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".secbox {\r\n");
      out.write("\twidth: 14%;\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".buttons {\r\n");
      out.write("\twidth: 16%;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tborder: 0px solid white;\r\n");
      out.write("\tborder-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");

	Admin_tools tool = new Admin_tools((String) request.getSession().getAttribute("ID"));
	int allpages = tool.getallpages();
	int nowpage = 1;
	if ((request.getParameter("act") != null && !"".equals(request.getParameter("act")))
			|| (request.getParameter("jumpact") != null && !"".equals(request.getParameter("jumpact")))) {
		if (request.getParameter("jumpact") != null && !"".equals(request.getParameter("jumpact"))) {
			nowpage = Integer.parseInt(request.getParameter("jumpact"));
		} else if ("1".equals(request.getParameter("act"))) {
			nowpage = 1;
		} else if ("2".equals(request.getParameter("act")) && nowpage > 1) {
			nowpage = nowpage - 1;
		} else if ("3".equals(request.getParameter("act"))) {
			nowpage = Integer.parseInt(request.getParameter("jumppage"));
		} else if ("4".equals(request.getParameter("act")) && nowpage < allpages) {
			nowpage = nowpage + 1;
		} else if ("5".equals(request.getParameter("act"))) {
			nowpage = allpages;
		}
	}
	tool.getcheck_mission(nowpage);
	int show = tool.showmission;
	//System.out.println("show:" + show);
	int all = tool.allmission;

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin_lead.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("block_id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("2", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<div style=\"width: 87.5%; margin-left: 0.1%; height: 824px; float: left;\" class=\"dinylight-color\">\r\n");
      out.write("\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom: 2px; float: left; width: 100%; margin-right: 0.2%;\">&nbsp;┃&nbsp;批改任务</div>\r\n");
      out.write("\t\t<!-- <form action=\"check_mission.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<button name=\"onlyunfinish\" value=\"1\" class=\"light-color\" style=\"margin-top: 5px; margin-left: 1%; width: 10%; height: 25px; color: white; border: 0px solid white; border-radius: 3px;\">只查看未批改</button>\r\n");
      out.write("\t\t</form> -->\r\n");
      out.write("\t\t<div style=\"width: 100%; height: 820px; background-color: white;\">\r\n");
      out.write("\t\t\t<div style=\"width: 100%; height: 35px; margin-top: 3px;\">\r\n");
      out.write("\t\t\t\t<div class=\"firbox light-color\">提交时间</div>\r\n");
      out.write("\t\t\t\t<div class=\"firbox light-color\">作业标题</div>\r\n");
      out.write("\t\t\t\t<div class=\"firbox light-color\">提交人</div>\r\n");
      out.write("\t\t\t\t<div class=\"firbox light-color\">语言</div>\r\n");
      out.write("\t\t\t\t<div class=\"firbox light-color\">状态</div>\r\n");
      out.write("\t\t\t\t<div class=\"secbox light-color\">任务类型</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

				String checkshow = request.getParameter("onlyunfinish");
				StringTokenizer chart1 = new StringTokenizer(tool.missions, "鲅");
				StringTokenizer chart2 = null;
				String color = "";
				for (int a = 0; a < show; a++) {
					chart2 = new StringTokenizer(chart1.nextToken(), "鰶");

					if (a % 2 == 0) {
						color = "dinylight-color";
					} else {
						color = "white-color";
					}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"check_mission_details.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div style=\"width: 100%; height: 35px; margin-top: 3px;\">\r\n");
      out.write("\t\t\t\t\t");

						String difficult = chart2.nextToken();
							String pageID = chart2.nextToken();
							String missionID = chart2.nextToken();
							String update_time = chart2.nextToken();
							String tittle = chart2.nextToken();
							String name = chart2.nextToken();
							String language = chart2.nextToken();
							String charge = chart2.nextToken();
							String type = chart2.nextToken();
							//System.out.println("difficult:"+difficult);
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"difficult\" value=\"");
      out.print(difficult);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"nowpage\" value=\"");
      out.print(nowpage);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"ID\" value=\"");
      out.print(request.getSession().getAttribute(" ID"));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"pageID\" value=\"");
      out.print(pageID);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"update_time\" value=\"");
      out.print(update_time);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"tittle\" value=\"");
      out.print(tittle);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"name\" value=\"");
      out.print(name);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"language\" value=\"");
      out.print(language);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input style=\"display: none\" name=\"type\" value=\"");
      out.print(type);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<div class=\"firbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(update_time);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"firbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(tittle);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"firbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(name);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"firbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(language);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"firbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(charge);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"secbox dinylight-color\">\r\n");
      out.write("\t\t\t\t\t\t<button class=\"");
      out.print(color);
      out.write("\" name=\"missionID\" value=\"");
      out.print(missionID);
      out.write("\" style=\"height: 100%; width: 100%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(type);
      out.write("</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t\t<form action=\"check_mission.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"turnpage-conntrol light-color\" style=\"height: 110px; padding-top: 1px;\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 100%; height: 25px; margin-bottom: 3px; line-height: 25px;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<font color=\"white\">\r\n");
      out.write("\t\t\t\t\t\t\t当前第\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(nowpage);
      out.write("页/ 共有\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(allpages);
      out.write("页\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(all);
      out.write("条记录\r\n");
      out.write("\t\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 100%; height: 35px; margin-bottom: 3px;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							for (int a = 1; a <= allpages; a++) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button name=\"jumpact\" value=\"");
      out.print(a);
      out.write("\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 7%; border: 0px solid white;\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(a);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\" style=\"width: 100%; height: 35px;\">\r\n");
      out.write("\t\t\t\t\t\t<button name=\"act\" value=\"1\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 12%; border: 0px solid white;\">首页</button>\r\n");
      out.write("\t\t\t\t\t\t<button name=\"act\" value=\"2\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 12%; border: 0px solid white;\">上一页</button>\r\n");
      out.write("\t\t\t\t\t\t<select name=\"jumppage\" style=\"width: 6%; height: 35px; border: 0px solid white; border-radius: 2px;\">\r\n");
      out.write("\t\t\t\t\t\t\t");

								for (int a = 1; a <= allpages; a++) {
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(a);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(a);
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t<button name=\"act\" value=\"3\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 6%; border: 0px solid white;\">跳转</button>\r\n");
      out.write("\t\t\t\t\t\t<button name=\"act\" value=\"4\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 12%; border: 0px solid white;\">下一页</button>\r\n");
      out.write("\t\t\t\t\t\t<button name=\"act\" value=\"5\" class=\"dinylight-color\" style=\"border-radius: 2px; height: 35px; width: 12%; border: 0px solid white;\">尾页</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
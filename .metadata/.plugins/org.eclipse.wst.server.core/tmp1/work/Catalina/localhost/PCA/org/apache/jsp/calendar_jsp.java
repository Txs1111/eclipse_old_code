/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-13 09:21:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Handle_date;
import bean.check_ifcalendar;
import bean.getpower;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.check_ifcalendar");
    _jspx_imports_classes.add("bean.Handle_date");
    _jspx_imports_classes.add("bean.getpower");
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
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("<link href=\"Css/Public_Color/orange.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Public_style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Homepage.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

	Handle_date date = new Handle_date();
	int nowday = date.getIntDay();
	int year = date.getIntyear();
	int month = date.getIntMonth();
	System.out.println(
			"date:" + date.getMonth() + "intdate" + date.getIntMonth() + "alldate:" + date.getIntDate());
	int a = 0, yvshu = 0;
	int day1 = 0;
	for (a = 2; a <= year; a++) {
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			day1 = day1 + 366;
		} else {
			day1 = day1 + 365;
		}
	}
	int m[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
	int n[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
	int day2 = 0;
	if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
		for (a = 0; a < month; a++) {
			day2 = day2 + n[a];
		}
	} else {
		for (a = 0; a < month; a++) {
			day2 = day2 + m[a];
		}
	}
	yvshu = (day1 + day2) % 7;

	String ID = request.getParameter("ID");
	String calendar = (String) request.getParameter("calendar");
	System.out.println("==" + calendar + "==" + ID);
	System.out.println(
			"1:" + yvshu + "nowday:" + nowday + "year:" + year + "month:" + month + "calendar:" + calendar);

      out.write("\r\n");
      out.write("<div class='calendar_whole_block'>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li class='week'>一</li>\r\n");
      out.write("\t\t<li class='week'>二</li>\r\n");
      out.write("\t\t<li class='week'>三</li>\r\n");
      out.write("\t\t<li class='week'>四</li>\r\n");
      out.write("\t\t<li class='week'>五</li>\r\n");
      out.write("\t\t<li class='week'>六</li>\r\n");
      out.write("\t\t<li class='week'>日</li>\r\n");
      out.write("\t\t");

			int c = 0;
			for (c = 1; c <= yvshu; c++) {
				out.println("<li></li>");
			}

			int m1[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int n1[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			String signed = request.getParameter("signed");
			check_ifcalendar check = new check_ifcalendar();
			if (yvshu % 4 == 0 && yvshu % 100 != 0 || yvshu % 400 == 0) {
				for (c = 1; c <= n1[month - 1]; c++) {
					if (c == nowday && "null".equals(calendar)) {
						out.println("<li class='today_li light-color'>" + c + "</li>");
					} else if (c == nowday && !"null".equals(calendar) || check.check(c, signed)) {
						out.println("<li class='today_li 'style='color:#FFA980;'>" + c + "</li>");
					} else {
						out.println("<li class='today_li dinylight-color'>" + c + "</li>");
					}
				}
			} else {
				for (c = 1; c <= m1[month - 1]; c++) {
					if (c == nowday && "null".equals(calendar)) {
						out.println("<li class='today_li light-color'>" + c + "</li>");
					} else if (c == nowday && !"null".equals(calendar) || check.check(c, signed)) {
						out.println("<li class='today_li 'style='color:#FFA980;'>" + c + "</li>");
					} else {
						out.println("<li class='today_li dinylight-color'>" + c + "</li>");
					}
				}
			}
		
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t");

		System.out.println("测试calendar:" + calendar);
		if (!"null".equals(calendar)) {
			out.println(
					"<!-- <form action='calendar_detail.jsp'method='post'>--> <button class='signup light-color'>已签到(查看更多)</button><!--</form>-->");
		} else {
			getpower power = new getpower(ID);
			if (power.checkpower("24")) {
	
      out.write("\r\n");
      out.write("\t<form action='calendar' method='post'>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t\t<button class='signup light-color' type='submit' name='calendar' value='");
      out.print(ID);
      out.write("'>签到</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t");

		}
	
      out.write("\r\n");
      out.write("</div>\r\n");
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

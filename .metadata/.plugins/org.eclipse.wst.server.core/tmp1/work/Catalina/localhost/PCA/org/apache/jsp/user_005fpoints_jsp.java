/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-13 06:11:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Score_bean;
import java.util.*;
import bean.getpower;

public final class user_005fpoints_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bean.Score_bean");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/score.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"./Css/Public_style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"./Css/Public_Color/orange.css\" />\r\n");
      out.write("<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String point = request.getParameter("user_point");
		String ID = (String) request.getSession().getAttribute("ID");
		//String ID = "000";
		Score_bean bean = new Score_bean(ID);
		int score = 0;
		int finish = 0;
		int rank = 0;	
		score=bean.getpoint();			
		finish=bean.allfinish;		
		rank=bean.userrank();
		getpower power=new getpower(ID);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"scorecard_tittle light-color\">\r\n");
      out.write("\t\t<font class=\"middle-font\">我的积分卡片</font>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"scorecard_date\">\r\n");
      out.write("\t\t<div class=\"scorecard_date_left small-font\">积分</div>\r\n");
      out.write("\t\t<div class=\"scorecard_date_centre small-font\">已完成</div>\r\n");
      out.write("\t\t<div class=\"scorecard_date_right small-font\">排名</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"scorecard_date_b\">\r\n");
      out.write("\t\t<div class=\"scorecard_date_left middle-font\">\r\n");
      out.write("\t\t");
if(power.checkpower("5")){ 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(score);
      out.write("\r\n");
      out.write("\t\t");
}else{
		
      out.write("\r\n");
      out.write("\t\t--\r\n");
      out.write("\t\t");
 
		}	
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"scorecard_date_centre middle-font\">\r\n");
      out.write("\t\t");
if(power.checkpower("5")){ 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(finish);
}else{
		
      out.write("\r\n");
      out.write("\t\t--\r\n");
      out.write("\t\t");
 
		}	
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"scorecard_date_right middle-font\">\r\n");
      out.write("\t\t");
if(power.checkpower("5")){ 
      out.write("\r\n");
      out.write("\t\t\t");
      out.print(rank);
}else{
		
      out.write("\r\n");
      out.write("\t\t--\r\n");
      out.write("\t\t");
 
		}	
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"scorecard_synthesize_tittle light-color\">\r\n");
      out.write("\t\t<font class=\"middle-font\">综合评分</font>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"scorecard_synthesize dinylight-color\">\r\n");
      out.write("\t\t<font class=\"big-font\">\r\n");
      out.write("\t\t");
if(power.checkpower("5")){ 
      out.write("\r\n");
      out.write("\t\t");
      out.print(point);
}else{
		
      out.write("\r\n");
      out.write("\t\t--\r\n");
      out.write("\t\t");
 
		}	
      out.write("</font>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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

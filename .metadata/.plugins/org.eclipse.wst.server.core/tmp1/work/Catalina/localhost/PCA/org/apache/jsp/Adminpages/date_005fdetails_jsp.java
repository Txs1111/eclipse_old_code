/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-10 02:37:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Adminpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.Admin_datadetails;
import java.util.StringTokenizer;

public final class date_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.Admin_datadetails");
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
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Public_style.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Assignment.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Public_Color/orange.css\" />\r\n");
      out.write("\t");
request.setCharacterEncoding("UTF-8");
			String ID=(String)request.getSession().getAttribute("ID");
			Admin_datadetails bean=new Admin_datadetails();
			String data=bean.getPCAstudata();
			StringTokenizer chart=new StringTokenizer(data,"_");
		
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Admin_lead.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("block_id", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("0", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t<div style=\"width:87.5%;margin-left:0.1%;height:824px;float:left;\" class=\"dinylight-color\">\r\n");
      out.write("\t\t\t<div class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t&nbsp;┃&nbsp;数据分析:计算机协会\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width:66.5%;float:left;margin-right:0.5%;\">\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;当前用户总数&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"font-size:50px;line-height:100px;width:100%;height:101px;color:white;float:left;\" align=\"center\" class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"width:33%;height:30px;float:left;\">\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;当天已签到人数&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"font-size:20px;line-height:35px;width:100%;float:left;color:white;height:35px;\" align=\"center\" class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;当天已提交任务次数&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"font-size:20px;line-height:35px;width:100%;float:left;color:white;height:35px;\" align=\"center\" class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"width:100%;height:100px;float:left;\">\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;margin-top:25px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;各部门人数明细&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.6%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;活动部&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.6%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;宣传部&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.6%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;外联部&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.6%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;运营部&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.6%;float:left;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;财务部&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div align=\"center\" style=\"width:19.6%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"center\" style=\"width:19.6%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"center\" style=\"width:19.6%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"center\" style=\"width:19.6%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"center\" style=\"width:19.6%;height:35px;color:white;float:left;line-height:35px;font-size:20px;\" class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");

			bean.load_mission_data();
			String mission_language_data=bean.mission_language_data;
			chart=new StringTokenizer(mission_language_data,"_");
			int num=chart.countTokens()/2;			
			
      out.write("\r\n");
      out.write("\t\t\t<div style=\"width:100%;height:70px;float:left;margin-top:50px;\">\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;任务相关明细/共");
      out.print(bean.missionsnum );
      out.write("个任务&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:100%;float:left;margin-top:5px;\"  class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;-&nbsp;任务语言及数量,任务语言");
      out.print(num );
      out.write("种\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div style=\"overflow-x: auto;width:100%;\">\r\n");
      out.write("\t\t\t\t<div style=\"width: ");
      out.print(num*150);
      out.write("px;\">\r\n");
      out.write("\t\t\t\t");
for(int a=0;a<num;a++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"width:147px;float:left;margin-left:3px;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width:100%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;-&nbsp;");
      out.print(chart.nextToken() );
      out.write("&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\" style=\"width:100%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
String mission_type_data=bean.mission_type_data;
			chart=new StringTokenizer(mission_type_data,"_");
			num=chart.countTokens()/2; 
      out.write("\r\n");
      out.write("\t\t\t<div style=\"width:100%;float:left;margin-top:5px;\"  class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t&nbsp;-&nbsp;任务类型及数量,任务类型");
      out.print(num );
      out.write("种\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t<div style=\"overflow-x: auto;width:100%;\">\r\n");
      out.write("\t\t\t\t<div style=\"width: ");
      out.print(num*150);
      out.write("px;\">\r\n");
      out.write("\t\t\t\t");
for(int a=0;a<num;a++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<div style=\"width:147px;float:left;margin-left:3px;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width:100%;float:left;margin-right:0.5%;margin-top:5px;\" align=\"center\" class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;-&nbsp;");
      out.print(chart.nextToken() );
      out.write("&nbsp;-&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div align=\"center\" style=\"width:100%;height:35px;color:white;float:left;line-height:35px;font-size:20px;margin-right:0.5%;\"\r\n");
      out.write("\t\t\t\t\t\t class=\"light-color\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(chart.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
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

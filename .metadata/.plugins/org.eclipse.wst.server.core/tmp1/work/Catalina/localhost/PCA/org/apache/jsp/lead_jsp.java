/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-14 06:35:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.getpower;

public final class lead_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_style.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Page_head.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"Css/Public_Color/orange.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String ID = request.getParameter("ID");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"lead_whole_block middle-font\">\r\n");
      out.write("\t\t<div class=\"lead_box\"></div>\r\n");
      out.write("\t\t<ul class=\"sign_list\" id=\"sign_list\" >\r\n");
      out.write("\t\t\t<form action=\"lead?page=1\" method=\"post\" id=\"pageform1\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"homepage\"style=\"cursor:pointer;margin-left:2%;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\" >\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/主页.png\" style=\"width: 80%; height: 100%\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t主页</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"lead?page=4\" method=\"post\" id=\"pageform4\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"message\"style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\" >\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/消息.png\" style=\"width:80%;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t消息\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"lead?page=3\" method=\"post\" id=\"pageform3\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"score\"style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/积分2.png\" style=\"width:80%;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t积分</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\t<form action=\"lead?page=2\" method=\"post\" id=\"pageform2\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"assignment\" style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/任务.png\" style=\"width:80%;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t任务</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<form action=\"lead?page=5\" method=\"post\" id=\"pageform5\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"work\"style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/作品.png\" style=\"width: 85%; height: 110%\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t作品</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"lead?page=6\" method=\"post\" id=\"pageform6\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"resuorce\"style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/资源.png\" style=\"width:60%;height:80%;margin-top:5px;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t资源</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t<!--  \r\n");
      out.write("\t\t\t<form action=\"lead?page=6\" method=\"post\" id=\"pageform6\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li id=\"question\"style=\"cursor:pointer;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/信封.png\" style=\"width:80%;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t反馈</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\t");

			getpower power=new getpower(ID);
			if(power.checkpower("9")){
			
      out.write("\r\n");
      out.write("\t\t\t<form action=\"lead?page=7\" method=\"post\" id=\"pageform7\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t<li style=\"float: right;cursor:pointer;margin-right:2%;\" id=\"lead_set\">\r\n");
      out.write("\t\t\t\t\t<div class=\"lead_symble\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/lead_photo/设置.png\" style=\"width:80%;\"/>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"height: 28px; line-height: 28px; width: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t设置</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"outerdiv\" style=\"position:fixed;top:0;left:0;background:rgba(192,192,192,0.5);z-index:2;width:100%;height:100%;display:none;\">\r\n");
      out.write("    \t    <div id=\"innerdiv\" style=\"position:absolute;\">\r\n");
      out.write("    \t        <img id=\"bigimg\" src=\"\" />\r\n");
      out.write("    \t    </div>\r\n");
      out.write("    \t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script src=\"js/loading.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\">\r\n");
      out.write("$(document).ready(function () {\r\n");
      out.write("\tvar homepage = document.getElementById(\"homepage\");\r\n");
      out.write("\thomepage.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform1').submit();\r\n");
      out.write("\t\tconsole.log('ok');\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t//window.location.href=\"lead?page=1\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar assignment = document.getElementById(\"assignment\");\r\n");
      out.write("\tassignment.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform2').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t//Document\t=\"lead?page=2\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar score = document.getElementById(\"score\");\r\n");
      out.write("\tscore.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform3').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t// window.location.href=\"lead?page=3\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar message = document.getElementById(\"message\");\r\n");
      out.write("\tmessage.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform4').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t// window.location.href=\"lead?page=4\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tvar work = document.getElementById(\"work\");\r\n");
      out.write("\twork.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform5').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t// window.location.href=\"lead?page=5\";\r\n");
      out.write("\t}\r\n");
      out.write("\tvar work = document.getElementById(\"resuorce\");\r\n");
      out.write("\twork.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform6').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t// window.location.href=\"lead?page=5\";\r\n");
      out.write("\t}\r\n");
      out.write("\t//var question = document.getElementById(\"question\");\r\n");
      out.write("\t//question.onclick = function() {\r\n");
      out.write("\t\t//document.getElementById('pageform6').submit();\r\n");
      out.write("\t\t//window.location.href=\"lead?page=6\";\r\n");
      out.write("\t//}\r\n");
      out.write("\r\n");
      out.write("\tvar set = document.getElementById(\"lead_set\");\r\n");
      out.write("\tset.onclick = function() {\r\n");
      out.write("\t\tdocument.getElementById('pageform7').submit();\r\n");
      out.write("\t\t imgShow(\"#outerdiv\", \"#innerdiv\", \"#bigimg\",\"img/pet_photo/fox.gif\");\r\n");
      out.write("\t\t console.log('ok');\r\n");
      out.write("\t\t//window.location.href=\"lead?page=7\";\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
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

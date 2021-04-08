/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-07 07:48:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Login.css\" />\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-image: url(img/background-photo/login.png);\">\r\n");
      out.write("<div style=\"width:100%;height:800px;overflow:hidden;\">\r\n");
      out.write("<div class=\"registerCheck_div\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t");
request.setCharacterEncoding("UTF-8");
			String color = "grey";
			int size = 1;
			String passwrong = "";
			String tips = (String) request.getAttribute("tips");
			System.out.println("tips"+tips);
			if ("wrong".equals(tips)) {
				color = "red";
				size = 2;
			} else if ("passwrong".equals(tips)) {
				passwrong = "两次密码不一致";
			} else if ("sameaccount".equals(tips)) {
				passwrong = "账号已被注册 ";
			}else if("infwrong".equals(tips)){
				passwrong = "信息未填完整 ";
			}
		
      out.write("\r\n");
      out.write("\t\t<div class=\"rigister_tittle\">\r\n");
      out.write("\t\t\t<div class=\"ahead_sign\">\r\n");
      out.write("\t\t\t\t<img src=\"img/season/ahead_blue.jpg\" style=\"height:100%;width: 100%;\"/> \r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t<div class=\"sign_borderline\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"rigister_background\" align=\"center\">\r\n");
      out.write("\t\t<form action=\"register_servlet\" method=\"post\" id=\"sub\">\r\n");
      out.write("\t\t\t<div style=\"width: 100%; height: 20px;margin-top:20px;\" align=\"center\">\r\n");
      out.write("\t\t\t\t<font size='");
      out.print(size);
      out.write("' color='");
      out.print(color);
      out.write("'>账号密码长度不得低于八位</font>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"text\"class=\"rigister_inputs\" name=\"account\" placeholder=\"  请输入用户名(推荐使用学号)\"/>\r\n");
      out.write("\t\t\t<div style=\"width: 100%; height: 20px; line-height: 20px;\"\talign=\"center\"> \r\n");
      out.write("\t\t\t<font id=\"tips\" size=\"1\" color=\"gray\">");
      out.print(passwrong);
      out.write("</font></div>\r\n");
      out.write("\t\t\t<input type=\"password\" class=\"rigister_inputs\" name=\"password\" placeholder=\"  请输入密码\"/>\t\t\t\r\n");
      out.write("\t\t\t<input type=\"password\" class=\"rigister_inputs\" name=\"repassword\" placeholder=\"  确认密码\"/>\t\t\r\n");
      out.write("\t\t\t<input type=\"text\"class=\"mess_input\" name=\"username\" style=\"margin-left: 11%;\" placeholder=\"  姓名\"/>\r\n");
      out.write("\t\t\t<input type=\"text\"class=\"mess_input\" name=\"school_ID\" placeholder=\"  学号\"/>\r\n");
      out.write("\t\t\t<input type=\"text\"class=\"mess_input\" name=\"clas\" style=\"margin-left: 11%;\" placeholder=\"  班级\"/>\r\n");
      out.write("\t\t\t<div class=\"mess_input_div\" style=\"color:grey;text-align: left;line-height: 30px\">\r\n");
      out.write("\t\t\t\t<font style=\"font-size: 13px\">&nbsp;&nbsp;部门&nbsp;&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t<select style=\"border:0;font-size: 13px;\" name=\"apartment\">\r\n");
      out.write("\t\t\t\t\t<option>--</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"1\">活动部</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"3\">外联部</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"6\">财务部</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"5\">运营部</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"2\">宣传部</option>\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t<input class=\"rigister_test_input\" name=\"Testcode\" type=\"text\" placeholder=\"  请输入验证码\" id=\"test_context\">\r\n");
      out.write("\t\t\t<div class=\"rigister_Testpc_area\" id=\"view\"></div>\r\n");
      out.write("\t\t\t<div class=\"Testline_area\">看不清？点击图片切换</div>\r\n");
      out.write("\t\t\t\t<input type=\"button\" id=\"check\" class=\"rigister_button\" style=\"cursor:pointer;margin-right:9%;margin-left:3%;float:right;\"value=\"注册\">\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"index.jsp\" method=\"post\" style=\" magin-top:10px;\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"rigister_button\" style=\"cursor:pointer;float:right;background-color: #84BFD9;font-size: 15px;margin-left:11%;\">已有账号<br/>直接登录</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div style=\" width: 75%;margin:0 auto; height: 80px;color:white;margin-top:220px;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"footer-b\">\r\n");
      out.write("\t\t\t\t\t<li style=\" font-size:15px;list-style: none;\">Copyright&nbsp;©2020计算机协会&nbsp;&nbsp;&nbsp;</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"color:white;font-size:15px;list-style: none;\"><a href=\"https://beian.miit.gov.cn/\" target=\"_blank\">\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"white\">&nbsp;&nbsp;赣ICP备2020015014号-1&nbsp;&nbsp;</font>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li style=\"font-size:15px;list-style: none;\">\r\n");
      out.write("\t\t\t\t\t\t作者:许良&nbsp;刘军&nbsp;王旭升&nbsp;谭炳昊\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"check_tail\">\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/gVerify.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.4.1.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"UTF-8\">\r\n");
      out.write("\t\tvar verifyCode = new GVerify({\r\n");
      out.write("\t\t            id : \"view\",\r\n");
      out.write("\t\t            type : \"blend\"\r\n");
      out.write("\t\t        })\r\n");
      out.write("\t\tdocument.getElementById(\"check\").onclick = function(){\r\n");
      out.write("\t\t\tvar res = verifyCode.validate(document.getElementById(\"test_context\").value);\r\n");
      out.write("\t\t\tif(res){\r\n");
      out.write("\t\t\t\tdocument.getElementById('sub').submit()\t\t\t\t\r\n");
      out.write("\t\t\t}else{\t\r\n");
      out.write("\t\t\t    alert(\"验证码错误\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t} \r\n");
      out.write("</script>");
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
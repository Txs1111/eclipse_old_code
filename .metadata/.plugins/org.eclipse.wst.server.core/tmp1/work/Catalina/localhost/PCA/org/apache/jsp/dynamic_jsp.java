/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-14 07:10:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.*;
import java.sql.*;
import java.util.*;

public final class dynamic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("dao");
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

      out.write('\r');
      out.write('\n');

	/*------------------------------------------------------------------------------------------------
	* 修改人			     
	* 修改时间 		
	* 修改
	* 版本号2.0
	* -------------------------------------------------------------------------------------------------*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"Css/Public_Color/orange.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Public_style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Homepage.css\" rel=\"stylesheet\" />\r\n");
      out.write("<style>\r\n");
      out.write(".imgs {\r\n");
      out.write("\theight: 120px;\r\n");
      out.write("\twidth: 32%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 1%;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".left_photo {\r\n");
      out.write("\tborder-top-left-radius: 16px;\r\n");
      out.write("\tborder-bottom-left-radius: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right_photo {\r\n");
      out.write("\tborder-top-right-radius: 16px;\r\n");
      out.write("\tborder-bottom-right-radius: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".two_photo {\r\n");
      out.write("\theight: 129px;\r\n");
      out.write("\twidth: 48.5%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 1%;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".one_photo {\r\n");
      out.write("\theight: 129px;\r\n");
      out.write("\tborder-radius: 16px;\r\n");
      out.write("\twidth: 98%;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\tmargin-left: 1%;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"dynamic_body_block\">\r\n");
      out.write("\t\t");

			String ID = request.getParameter("ID");//接收从Homepage.jsp页面form中传过来的ID
			//String ID = (String) request.getSession().getAttribute("ID");//接收session中的ID
			//System.out.println("#############dynamic.jsp：" + ID);
			dynamicDao dynamic = new dynamicDao();//创建dynamicDao对象，以便使用dynamicDao中的方法
			Message dmessage = dynamic.data();//创建一个message对象，接收dynamicDao中的获取所有数据的方法
			Message head_message = dynamic.data();//创建一个message对象（头结点），取出所有图片
			int times = 4;//动态条数
		
      out.write("\r\n");
      out.write("\t\t<form action=\"dynamic_details.jsp\" method=\"post\" name=\"form_ID\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display: none;\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<!-- form表单传值 -->\r\n");
      out.write("\t\t");

			/* System.out.println("dynamic.jsp dmessage.head_photo：" + dmessage.head_photo); */
			for (int detaile_number = 1; detaile_number <= times; detaile_number++) {//循环打印动态消息
		
      out.write("\r\n");
      out.write("\t\t<div id=\"tidings\">\r\n");
      out.write("\t\t\t<div id=\"tidings_left\">\r\n");
      out.write("\t\t\t\t<div id=\"img\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/head_photo/");
      out.print(dmessage.head_photo);
      out.write(".jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 15px; borde r-radius: 25px; margin-left: 15px;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"small_head_photo\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"name\">\r\n");
      out.write("\t\t\t\t\t<font class=\"small-font\" id=\"samll-B\">");
      out.print(dmessage.nickiname);
      out.write("</font><br />\r\n");
      out.write("\t\t\t\t\t<a> <font class=\"small-font\">");
      out.print(dmessage.title);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"detail\">\r\n");
      out.write("\t\t\t\t\t<div id=\"detail_photo\"></div>\r\n");
      out.write("\t\t\t\t\t<div id=\"detail_text\">\r\n");
      out.write("\t\t\t\t\t\t");

							request.getSession().setAttribute("head_message", head_message);
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"tidings_right\">\r\n");
      out.write("\t\t\t\t<div class=\"dynamic_content_new dinylight-color\"\r\n");
      out.write("\t\t\t\t\tstyle=\"border-radius: 1px;\">\r\n");
      out.write("\t\t\t\t\t<font>");
      out.print(dmessage.content);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t<div class=\"dynamic_content_img\">\r\n");
      out.write("\t\t\t\t\t\t");

							//for (int i = 0; i < dynamic.getAllphotourl(dmessage).size(); i++) {
								switch (dynamic.getAllphotourl(dmessage).size()) {
									case 3 :
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 100%; height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"imgs left_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(0));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"imgs\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(1));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"imgs right_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(2));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

							break;
									case 2 :
						
      out.write("<div\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 100%; height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"two_photo left_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(0));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"two_photo right_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(1));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

							break;
									case 1 :
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 100%; height: 200px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"one_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"");
      out.print(dynamic.getAllphotourl(dmessage).get(0));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"pimg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"object-fit: cover; width: 100%; height: 100%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t");

							break;
								}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"function\">\r\n");
      out.write("\t\t\t\t\t<div id=\"time\">\r\n");
      out.write("\t\t\t\t\t\t<font id=\"samll\">");
      out.print(dmessage.psotdate);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"like\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/example/点赞.png\" id=\"good\"> <font id=\"samll\">");
      out.print(dmessage.like);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"outerdiv_1\" style=\"position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;\">\r\n");
      out.write("\t    <div id=\"innerdiv_1\" style=\"position:absolute;\">\r\n");
      out.write("\t        <img id=\"bigimg_1\" style=\"border:1px solid #fff;\" src=\"\" />\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t<!-- ######################################################## -->\r\n");
      out.write("\t\t");

			dmessage = dmessage.next;//定位到下一个对象
			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\".pimg\").click(function() {\r\n");
      out.write("\t\t\tvar _this = $(this);//将当前的pimg元素作为_this传入函数  \r\n");
      out.write("\t\t\timgShow_1(\"#outerdiv_1\", \"#innerdiv_1\", \"#bigimg_1\", _this);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction imgShow_1(outerdiv, innerdiv, bigimg, _this) {\r\n");
      out.write("\t\tvar src = _this.attr(\"src\");//获取当前点击的pimg元素中的src属性  \r\n");
      out.write("\t\t$(bigimg).attr(\"src\", src);//设置#bigimg元素的src属性  \r\n");
      out.write("\r\n");
      out.write("\t\t/*获取当前点击图片的真实大小，并显示弹出层及大图*/\r\n");
      out.write("\t\t$(\"<img/>\").attr(\"src\", src).load(function() {\r\n");
      out.write("\t\t\tvar windowW = $(window).width();//获取当前窗口宽度  \r\n");
      out.write("\t\t\tvar windowH = $(window).height();//获取当前窗口高度  \r\n");
      out.write("\t\t\tvar realWidth = this.width;//获取图片真实宽度  \r\n");
      out.write("\t\t\tvar realHeight = this.height;//获取图片真实高度  \r\n");
      out.write("\t\t\tvar imgWidth, imgHeight;\r\n");
      out.write("\t\t\tvar scale = 0.8;//缩放尺寸，当图片真实宽度和高度大于窗口宽度和高度时进行缩放  \r\n");
      out.write("\r\n");
      out.write("\t\t\tif (realHeight > windowH * scale) {//判断图片高度  \r\n");
      out.write("\t\t\t\timgHeight = windowH * scale;//如大于窗口高度，图片高度进行缩放  \r\n");
      out.write("\t\t\t\timgWidth = imgHeight/realHeight*realWidth;\r\n");
      out.write("\t\t\t\tif (imgWidth > windowW * scale) {//如宽度扔大于窗口宽度  \r\n");
      out.write("\t\t\t\t\timgWidth = windowW * scale;//再对宽度进行缩放  \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} else if (realWidth > windowW * scale) {//如图片高度合适，判断图片宽度  \r\n");
      out.write("\t\t\t\timgWidth = windowW * scale;//如大于窗口宽度，图片宽度进行缩放  \r\n");
      out.write("\t\t\t\timgHeight = imgWidth/realWidth*realHeight;\r\n");
      out.write("\t\t\t} else {//如果图片真实高度和宽度都符合要求，高宽不变  \r\n");
      out.write("\t\t\t\timgWidth = realWidth;\r\n");
      out.write("\t\t\t\timgHeight = realHeight;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(bigimg).css(\"width\", imgWidth);//以最终的宽度对图片缩放  \r\n");
      out.write("\r\n");
      out.write("\t\t\tvar w = (windowW - imgWidth)/2;\r\n");
      out.write("\t\t\tvar h = (windowH - imgHeight)/2;\r\n");
      out.write("\t\t\t$(innerdiv).css({\r\n");
      out.write("\t\t\t\t\"top\" :h,\r\n");
      out.write("\t\t\t\t\"left\" :w\r\n");
      out.write("\t\t\t});//设置#innerdiv的top和left属性  \r\n");
      out.write("\t\t\t$(outerdiv).fadeIn(\"fast\");//淡入显示#outerdiv及.pimg  \r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(outerdiv).click(function() {//再次点击淡出消失弹出层  \r\n");
      out.write("\t\t\t$(this).fadeOut(\"fast\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
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
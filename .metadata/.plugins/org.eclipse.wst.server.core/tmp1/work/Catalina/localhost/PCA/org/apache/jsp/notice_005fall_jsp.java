/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-02-25 12:18:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.*;
import bean.*;
import java.util.StringTokenizer;

public final class notice_005fall_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
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

/*------------------------------------------------------------------------------------------------
修改人			  许良     
修改时间 	   2021/1/25
修改内容		   实现倒序展示
版本号			 0.0.1
-------------------------------------------------------------------------------------------------*/
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\t\tbutton{\r\n");
      out.write("\t\t\tborder:0;\r\n");
      out.write("\t\t\toutline:none;\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<link href=\"Css/Public_Color/orange.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Public_style.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Homepage.css\" rel=\"stylesheet\" />\r\n");
      out.write("<body bgcolor=\"#F4F5F7\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 调用头部页面 -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
	
	request.setCharacterEncoding("UTF-8") ;//或者指定的编码(GBK或其他)
	String ID = null;
	if (request.getAttribute("ID") != null || request.getAttribute("ID") != "") {
		ID=request.getParameter("ID");
	}
	//接收表单传过来的当前页数
	String nowpages = request.getParameter("nowpage");//传值给当前页码
	int nowpage;//真*当前页码
	if (nowpages == null || nowpages.equals("")) { //安全设置
		nowpage = 1;
	} else {
		  try {
			  //把接收的值赋值给当前页码
		      nowpage = Integer.parseInt(nowpages.trim());//Integer.parseInt String强转Int类型  .tirm()去掉两端空格
		      } catch (NumberFormatException e) {
		       nowpage = 1;
		      }
		      if(nowpage <= 0) //安全设置
		    	 nowpage =nowpage+1;
	 }

	
	Homepage_bean bean  = new Homepage_bean(ID);
	bean.head();
	NoticeAll_Dao t_pages = new NoticeAll_Dao();
			
		
			int pageSize = 10;//设置页面最大记录数
			int allRecord = t_pages.get_allRecord("notice");//全部记录
			int allPages = allRecord/pageSize+1;//总页数(allpages)=总记录数/每页显示数+1
			
			//安全设置
			if(nowpage>allPages){
				nowpage=allPages;
			}
			
			
			int startRecord = (nowpage - 1) * pageSize; //设置起始查询记录序数  (例：第三页起始记录数为3 减去一*最大记录数5=10，即从第10条开始查询)
			
			//int startRecord = allRecord - ((nowpage) * pageSize); //设置起始查询记录序数 (倒序) (例：总记录数为 54 第三页起始记录为 54-（3-1）*10 = 34)
			
			//最后一页的记录数
			int nowpage_lines = pageSize;
			if(nowpage==allPages){
				nowpage_lines = allRecord % pageSize;
			}
			
			
			String need_search = "poster_id,ID,tittle,postdate";//查询字段 发布人id、标题、发布日期、详情ID
			String content = t_pages.get_pageData(startRecord, pageSize,"notice",need_search);
												//起始记录    页面最大记录数   查询表名     查询字段
	
	
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 调用头部页面 -->\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "season.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "head.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("level", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(bean.level ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("nickiname", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(bean.nickiname ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("sign", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(bean.sign ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("background", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(bean.background ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("headphoto", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(bean.headphoto ), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "lead.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("ID", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(ID ), request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"Homepage.jsp\" method=\"post\" name=\"\">\r\n");
      out.write("\t<div style=\"width:75%;margin:0 auto;\">\r\n");
      out.write("\t\t<div class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t&nbsp;┃&nbsp;\r\n");
      out.write("\t\t\t\t<button class=\"middle-font font-light-color\" value=\"");
      out.print(ID);
      out.write("\" name=\"ID\" style=\"cursor:pointer;background-color: #FAFAFA\" >主页</button>\r\n");
      out.write("\t\t\t\t<button class=\"middle-font font-light-color\" disabled=\"disabled\" style=\"cursor:pointer;background-color: #FAFAFA\" > / 全部公告</button>\r\n");
      out.write("\t\t\t\t<img src=\"img/lead_photo/返回.png\"style=\"width:30px;height:25px;float:right;\">\r\n");
      out.write("\t\t\t\t<button class=\"middle-font font-light-color\" value=\"");
      out.print(ID);
      out.write("\" name=\"ID\" style=\"cursor:pointer;float:right;background-color: #FAFAFA\" >返回上一级</button>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div style=\"width: 100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t<table style=\"width:100%;height: 75px; color: darkslategray;\" border=\"0\"\r\n");
      out.write("\t\t\t\t\tcellspacing=\"1px\">\r\n");
      out.write("\t\t\t\t\t<tr style=\"width: 100%;background-color: #FFCAB0; height: 30px;\">\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 15%;\">发布人</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 70%;\">发布内容</th>\r\n");
      out.write("\t\t\t\t\t\t<th style=\"width: 15%;\">发布时间</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

					StringTokenizer textline_cut = new StringTokenizer(content,"轎藎燼");//new 一个字符串剪切对象
					String text_line = "";//定义临时变量存储总字串
					for(int a=0;a<nowpage_lines;a++){
						
						
						text_line = textline_cut.nextToken(); //获取数据字符串
						StringTokenizer line_cut = new StringTokenizer(text_line,"麤讜黌");//new 一个子字符串剪切对象
						String posterer_id = line_cut.nextToken();//创建变量存储 id
						String poster_nickiname = t_pages.get_nickiname(posterer_id);//根据id 获取昵称
						String poster_headPhoto = t_pages.get_headPhoto(posterer_id);//根据id 获取头像					
						String notice_id = line_cut.nextToken();
						if (a % 2 == 0) {
								out.println("<tr style='background-color: #FFEFE8;'>");
							} else
								out.println("<tr style='background-color: white;'>");
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 45px; color: darkgrey; \"align=\"left\">\r\n");
      out.write("\t\t\t\t\t<div style=\"float:left;\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/head_photo/");
      out.print(poster_headPhoto);
      out.write(".jpg\" style=\"margin-top:2px;margin-left:10px; width:40px;height:40px;border-radius:20px;\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div style=\"float:left;margin-left:10px;\">\r\n");
      out.write("\t\t\t\t\t<font style=\"line-height:45px;\">\t");
      out.print(poster_nickiname);
      out.write(".</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 45px; color: darkgrey; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t<form action=\"notice_detail\" method=\"post\" id=\"form_");
      out.print(a);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"notice_ID\" value=\"");
      out.print(notice_id );
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<a class=\"small-font \" onclick=\"document:form_");
      out.print(a);
      out.write(".submit();\"style=\"cursor:pointer;\">");
      out.print(line_cut.nextToken());
      out.write("</a>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"height: 45px; color: darkgrey; text-align: center;\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(line_cut.nextToken());
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<form name=\"form\" action=\"notice_all.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t<div class=\"turnpage-conntrol light-color\">\r\n");
      out.write("\t\t\t\t<div class=\"turnpage-foin\">\r\n");
      out.write("\t\t\t\t\t<button  value=\"1\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 10%;cursor:pointer;\"><font class=\"small-font\">首页</font></button>\r\n");
      out.write("\t\t\t\t\t<button  value=\"");
      out.print(nowpage-1);
      out.write("\" name=\"nowpage\"style=\"cursor:pointer;\" class=\"turnpage-number small-font font-normal-color\"><font class=\"small-font\">上一页</font></button>\r\n");
      out.write("\t\t\t\t\t<div class=\"turnpage-turn font-normal-color\"> <font class=\"small-font\">第");
      out.print(nowpage);
      out.write('页');
      out.write('/');
      out.write('共');
      out.print(allPages);
      out.write("页</font></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"turnpage-turn font-normal-color\" id=\"se\" >\r\n");
      out.write("\t\t\t\t\t<select disabled=\"disabled\"  name=\"nowpage\" style=\"float: left;border: 0;margin-top: 9px;margin-left: 7%;\" class=\"font-normal-color small-font\" id=\"check\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("       \t\t\t\t");

      		 			for(int i=1; i<=allPages; i++) {
     				
      out.write("\r\n");
      out.write("      \t \t\t\t<option value=");
      out.print(i);
      out.write(' ');
      out.print((nowpage == i) ? "selected" : "");
      out.write('>');
      out.write(' ');
      out.write('第');
      out.print(i);
      out.write('页');
      out.write(' ');
}
      out.write("\r\n");
      out.write(" \t\t \t\t\t</select>\t\t\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 20%;cursor:pointer;\"><font class=\"small-font\">▶</font></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button  value=\"");
      out.print(nowpage+1);
      out.write("\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\"style=\"cursor:pointer;\"><font class=\"small-font\">下一页</font></button>\r\n");
      out.write("\t\t\t\t\t<button value=\"");
      out.print(allPages);
      out.write("\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 10%;cursor:pointer;\"><font class=\"small-font\">尾页</font></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t");
t_pages.con.close(); 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>        \r\n");
      out.write("       \r\n");
      out.write("$(function(){\r\n");
      out.write("\t$('#homepage').css('border-bottom-style','solid');\r\n");
      out.write("\tvar $logo = $('#sign_list li');\r\n");
      out.write("\t \r\n");
      out.write("\t $('#se').click(function(){\r\n");
      out.write("\t\t\t$('#check').attr(\"disabled\",false);\r\n");
      out.write("\t\t });    \r\n");
      out.write("    \r\n");
      out.write("\t \r\n");
      out.write("\t $logo.mouseenter(function(){\r\n");
      out.write("    \t $(this).css('border-bottom-style','solid');\r\n");
      out.write("    \t $('#homepage').css('border-bottom-style','none');\r\n");
      out.write(" \t\t});\r\n");
      out.write("\t \r\n");
      out.write("\t $logo.mouseleave(function(){ \r\n");
      out.write("\t\t  $logo.css('border-bottom-style','none');\r\n");
      out.write("\t\t  $('#homepage').css('border-bottom-style','solid');\r\n");
      out.write("\t\t });\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-14 07:11:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.sound.midi.SysexMessage;
import bean.Work_bean;
import java.util.StringTokenizer;

public final class Work_005fblock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.StringTokenizer");
    _jspx_imports_classes.add("javax.sound.midi.SysexMessage");
    _jspx_imports_classes.add("bean.Work_bean");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_style.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Work.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_Color/orange.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\t\ta{\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

		//接收传过来的ID 和类型
		String ID = null;
		String type = "1";
		String pages = "1";
		if(request.getAttribute("ID")!=null)
		{
		ID=(String)request.getAttribute("ID");
		}else if(request.getParameter("ID")!=null)
		{
		ID=request.getParameter("ID");
		}
		if(request.getParameter("type")!=null)
		{
		type=request.getParameter("type");
		}
		if(request.getParameter("pages")!=null)
		{
		pages=request.getParameter("pages");
		}

      out.write('\r');
      out.write('\n');

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


		Work_bean wb = new Work_bean(ID);
		
	
		int pageSize = 4;//设置页面最大记录数
		int allRecord =wb.get_allRecord("all_works",type,pages,ID);//全部记录
		int allPages = allRecord/pageSize+1;//总页数(allpages)=总记录数/每页显示数+1
		
		//安全设置
		if(nowpage>allPages){
			nowpage=allPages;
		}
		
		
		int startRecord = (nowpage - 1) * pageSize; //设置起始查询记录序数  (例：第三页起始记录数为3 减去一*最大记录数5=10，即从第10条开始查询)
		
		//最后一页的记录数
		int nowpage_lines = pageSize;
		if(nowpage==allPages){
			nowpage_lines = allRecord % pageSize;
			if(nowpage_lines ==1){
				nowpage_lines = allRecord;
			}
		}
		
		
		
		String need_search = "ID,content,tittle,like,finish_date,work_id";//查询字段 发布人id、标题、发布日期、点赞数、内容
		String content = wb.get_Allcontent(startRecord, pageSize,"all_works",need_search,type,pages,ID);
											//起始记录    页面最大记录数   查询表名     查询字段   页面类型    用户id

	    String poster_id = "000";//定义发布人id
	    String poster_nickiname = "Frank";//定义发布人昵称
	    String tittle = "2222";//定义标题
	    String date = "222";//定义日期
	    String contents = "22222";//定义内容
	    String head_photo = "1";//定义头像
	    String likes = "10";//定义点赞数
	    String work_id = "1";
	    
	   
	    if(content.equals("")||content==null){
	    	 
      out.write("\r\n");
      out.write("\t    <div style=\"width:100%;margin-top:60px;text-align: center;float:left\">\r\n");
      out.write("\t\t\t\t<img src=\"img/example/empty1.png\"></br></br>\r\n");
      out.write("\t\t\t\t<font style=\"font-size:20px;color:#bfbfbf\"><b> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;目前还啥都没有~ </b></font>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t     \r\n");
      out.write("\t    \t \r\n");
      out.write("\t     ");

	    }else{
	    StringTokenizer textline_cut = new StringTokenizer(content,"轎藎燼");//new 一个字符串剪切对象
		String text_line = "";//定义临时变量存储总字串

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"body_block\" id=\"display\">\r\n");
      out.write("\t\r\n");
      out.write("\t");
	for(int a=0;a<nowpage_lines;a++){
			text_line = textline_cut.nextToken(); //获取数据字符串
			StringTokenizer line_cut = new StringTokenizer(text_line,"麤讜黌");//new 一个子字符串剪切对象
			poster_id = line_cut.nextToken();//创建变量存储 id
			poster_nickiname = wb.get_nickiname(poster_id);//根据id 获取昵称
			head_photo = wb.get_headPhoto(poster_id);//根据id 获取头像	
			contents = line_cut.nextToken();
			tittle = line_cut.nextToken();
			likes = line_cut.nextToken();
			date = line_cut.nextToken();
			work_id = line_cut.nextToken();
			String file_name = "once";
			String file_url = "/once/homepage.html";
			if(type.equals("2")){
				StringTokenizer url_cut = new StringTokenizer(contents,"$%");
				while(url_cut.hasMoreTokens()){
					file_name = url_cut.nextToken();
					file_url = url_cut.nextToken();
				}
			}
	
      out.write("\t\r\n");
      out.write("\t\t<div id=\"tidings\">\r\n");
      out.write("\t\t\t<div id=\"tidings_left\">\r\n");
      out.write("\t\t\t\t<div id=\"img\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/head_photo/");
      out.print(head_photo);
      out.write(".jpg\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"margin-top: 15px; border-radius: 25px; margin-left: 15px;\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"small_head_photo\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"name\">\r\n");
      out.write("\t\t\t\t\t<font class=\"small-font\" id=\"samll-B\">");
      out.print(poster_nickiname);
      out.write("</font><br /> <a>\r\n");
      out.write("\t\t\t\t\t\t<font class=\"small-font\">");
      out.print(tittle);
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"detail\">\r\n");
      out.write("\t\t\t\t<div id=\"detail_photo\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"detail_text\">\r\n");
      out.write("\t\t\t\t");
if(type.equals("1")){
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"Work_details.jsp\" method=\"post\" id=\"form_");
      out.print(a);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<a onclick=\"document:form_");
      out.print(a);
      out.write(".submit();\">详细</a>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"work_id\" value=\"");
      out.print(work_id);
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
if(type.equals("2")){
      out.write("\t\r\n");
      out.write("\t\t\t\t<form action=\"Work_surface_show.jsp\" method=\"post\" id=\"form_");
      out.print(a);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<a onclick=\"document:form_");
      out.print(a);
      out.write(".submit();\">详细</a>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"file_name\" value=\"");
      out.print(file_name );
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"file_url\" value=\"");
      out.print(file_url );
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"type\" value=\"");
      out.print(pages+"_"+type);
      out.write("\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"tidings_right\" style=\"margin-top:1px;\">\r\n");
      out.write("\t\t\t\t<div class=\"dynamic_content_new dinylight-color\"style=\"border-radius: 1px;\">\r\n");
      out.write("\t\t\t\t\t");
if(type.equals("1")){
      out.write("<textarea class=\"dynamic_content_new dinylight-color\" readonly=\"readonly\" style=\"width:100%;border:0;resize: none;\">");
      out.print(contents );
      out.write("</textarea>");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t");
if(type.equals("2")){
					
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"dynamic_content_new dinylight-color\"style=\"border-radius: 1px;\">\r\n");
      out.write("\t\t\t\t\t");
      out.print("<img src='user_work_surface/"+file_name+".png' style='width: 100%; height: 100%;object-fit: cover;'/>");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"function\">\r\n");
      out.write("\t\t\t\t\t<div id=\"time\">\r\n");
      out.write("\t\t\t\t\t\t<font id=\"samll\">");
      out.print(date );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"like\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"img/example/点赞.png\" id=\"good\"> <font id=\"samll\">");
      out.print(likes );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
}  
      out.write("\r\n");
      out.write("\t\t<!-- 分页模块 -->\r\n");
      out.write("\t\t\t<form name=\"form\" action=\"Work.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"turnpage-conntrol light-color\">\r\n");
      out.write("\t\t\t\t<div class=\"turnpage-foin\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"ID\" value=\"");
      out.print(ID);
      out.write("\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"type\" value=\"");
      out.print(pages+"_"+type);
      out.write("\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t<button  value=\"1\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 10%;\"><font class=\"small-font\">首页</font></button>\r\n");
      out.write("\t\t\t\t\t<button  value=\"");
      out.print(nowpage-1);
      out.write("\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\"><font class=\"small-font\">上一页</font></button>\r\n");
      out.write("\t\t\t\t\t<div class=\"turnpage-turn font-normal-color\"> <font class=\"small-font\">第");
      out.print(nowpage);
      out.write('页');
      out.write('/');
      out.write('共');
      out.print(allPages);
      out.write("页</font></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"turnpage-turn font-normal-color\" id=\"e\" >\r\n");
      out.write("\t\t\t\t\t<select disabled=\"true\" name=\"nowpage\" style=\"float: left;border: 0;margin-top: 9px;margin-left: 7%;\" class=\"font-normal-color small-font\" id=\"wascheck\">\r\n");
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
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 20%;\"><font class=\"small-font\">▶</font></button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button  value=\"");
      out.print(nowpage+1);
      out.write("\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\"><font class=\"small-font\">下一页</font></button>\r\n");
      out.write("\t\t\t\t\t<button value=\"");
      out.print(allPages);
      out.write("\" name=\"nowpage\" class=\"turnpage-number small-font font-normal-color\" style=\"width: 10%;\"><font class=\"small-font\">尾页</font></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
}wb.con.close(); 
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\t \r\n");
      out.write("\t $('#e').click(function(){\r\n");
      out.write("\t\t\t$('#wascheck').attr(\"disabled\",false);\r\n");
      out.write("\t\t });\r\n");
      out.write("\t});        \r\n");
      out.write("         \r\n");
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
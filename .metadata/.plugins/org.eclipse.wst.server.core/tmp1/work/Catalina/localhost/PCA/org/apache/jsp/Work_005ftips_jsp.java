/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-03-06 09:16:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.official_bean;
import java.util.*;

public final class Work_005ftips_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.official_bean");
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
修改人  王旭升			     
修改时间 	2021-1-28	
修改内容	添加访问限制
版本号			 
-------------------------------------------------------------------------------------------------*/
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Message.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_style.css\" />\r\n");
      out.write("<link href=\"Css/Homepage.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"Css/Public_Color/orange.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

    request.setCharacterEncoding("UTF-8"); //或者指定的编码(GBK或其他)	
    String act=request.getParameter("act");
    	String nowpages = request.getParameter("nowpage");//传值给当前页码	  
      if(act!=null&&!"".equals(act)){
    	  String allpages =request.getParameter("allpage");
    	  String topages =request.getParameter("topage");
    	 if("1".equals(act)){
    		 nowpages="1";
    	 }else if("2".equals(act)&&Integer.parseInt(nowpages)-1>0){
    		 nowpages=(Integer.parseInt(nowpages)-1)+"";
    		 
    	 }else if("3".equals(act)){
    		 nowpages=topages;
    	 }else if("4".equals(act)&&Integer.parseInt(nowpages)+1<=Integer.parseInt(allpages)){
    		 nowpages=(Integer.parseInt(nowpages)+1)+"";
    	 }else if("5".equals(act)){
    		 nowpages=allpages;
    	 }
      }
    
      out.write("\r\n");
      out.write("    <div id=\"Message\">\r\n");
      out.write("\t\t<div id=\"Message_head\" class=\"small-tittle middle-font font-normal-color\">&nbsp;┃&nbsp;作业提醒\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

		//把接收的值赋值给当前页码
		  
		  String get_id  =(String)request.getSession().getAttribute("ID");
		  
		  

		  if (nowpages == null || nowpages.equals("")) { //安全设置
				nowpages = "1";
			} 
		  if (get_id==null){
			  get_id="页面出错";
		  }
		  
		  
		  //提取数据
		  official_bean bean = new official_bean();
	      String result = bean.getmessage(get_id,"0");
	      //String sent_ID;
	      //String get_ID;
	      //String tittle;
	      //String conntent;
	      //String send_time;
	      //String type;
	      
	      
	     //显示一页的数据
	     int allPages;//总页数

	     if(result!=null&&!"".equals(result)){
	     StringTokenizer st=new StringTokenizer(result,"鰶");
	     int num=st.countTokens()/7;
	     int pages=Integer.parseInt(nowpages);
	     for(int a=0;a<(pages-1)*3;a++){
	    	 for(int b=0;b<7;b++){
	    		 st.nextToken();
	    	 }
	     }num=num-(pages-1)*3;
	     if(num>3){
	    	 num=3;
	     }
		  for(int i = 0;i<num;i++){			 
			  //判断是否显示若为空则不显示
			  
				  
      out.write("\r\n");
      out.write("\t\t\t\t     <div id=\"tidings\" style=\"height:210px; border-bottom: none;\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"tidings_left\">\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"img\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img src=\"img/head_photo/");
      out.print(st.nextToken() );
      out.write(".jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"margin-top: 15px; border-radius: 25px; margin-left: 15px;\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"small_head_photo\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"name\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<font class=\"small-font\" id=\"samll-B\">");
      out.print(st.nextToken() );
      out.write("</font><br />\r\n");
      out.write("\t\t\t\t\t\t\t\t");
st.nextToken(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t <a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font class=\"small-font\">");
      out.print(st.nextToken() );
      out.write("</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div id=\"tidings_right\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"dynamic_content_new dinylight-color\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"border-radius: 1px; height:80px;\"><textarea style=\"width:100%;height:100%;border:0px solid white;\">");
      out.print(st.nextToken() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"function\" style=\"border-bottom: 1px solid gainsboro;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"time\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<font id=\"samll\">");
      out.print(st.nextToken() );
      out.write("</font>");
st.nextToken(); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"like\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"img/example/点赞.png\" id=\"good\"> <font id=\"samll\">10</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div id=\"like\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<img src=\"img/example/收藏.png\" id=\"good\"> <font id=\"samll\">22</font>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");

					
			  
		  }
		  int allpage=0;
			int num1=bean.allnum;
				for (;;) {
					num1 = num1 - 3;
					
					if (num1 == -3) {	
						allpage=1;
						break;
					} else if (num1 > -3 && num1 <= 0) {
						allpage = allpage  + 1;							
						break;
					} else if (num1 > 0) {
						allpage  = allpage  + 1;
					}
				}
		
      out.write("\r\n");
      out.write("\t\t<form action=\"Work_tips.jsp\"method=\"post\">\r\n");
      out.write("\t\t<input name=\"nowpage\" value=\"");
      out.print(nowpages );
      out.write("\"style=\"display:none;\" >\r\n");
      out.write("\t\t<input name=\"allpage\" value=\"");
      out.print(allpage );
      out.write("\"style=\"display:none;\" >\r\n");
      out.write("\t\t<div class=\"turnpage-conntrol light-color\" style=\"height:110px;padding-top: 1px;\">\r\n");
      out.write("\t\t\t<div style=\"width:100%;height:25px;margin-bottom:3px;line-height:25px;\" align=\"center\">\r\n");
      out.write("\t\t\t<font color=\"white\">\t当前第");
      out.print(nowpages );
      out.write("页/ 共有");
      out.print(allpage );
      out.write('页');
      out.print(bean.allnum );
      out.write("条消息\t</font>\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"width:100%;height:35px;\">\r\n");
      out.write("\t\t\t\t<button name=\"act\"value=\"1\" class=\"dinylight-color\" style=\"cursor:pointer;border-radius:2px;height:35px;width:12%;border:0px solid white;\">首页</button>\r\n");
      out.write("\t\t\t\t<button name=\"act\"value=\"2\"class=\"dinylight-color\" style=\"cursor:pointer;border-radius:2px;height:35px;width:12%;border:0px solid white;\">上一页</button>\r\n");
      out.write("\t\t\t\t<select name=\"topage\"style=\"width:6%;height:35px;border:0px solid white;border-radius:2px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(nowpages );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(nowpages );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								for(int c=0;c<allpage ;c++)
								{ 
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(c+1 );
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print(c+1 );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} 
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t<button name=\"act\"value=\"3\"class=\"dinylight-color\" style=\"cursor:pointer;border-radius:2px;height:35px;width:6%;border:0px solid white;\">跳转</button>\r\n");
      out.write("\t\t\t\t<button name=\"act\"value=\"4\"class=\"dinylight-color\" style=\"cursor:pointer;border-radius:2px;height:35px;width:12%;border:0px solid white;\">下一页</button>\r\n");
      out.write("\t\t\t\t<button name=\"act\"value=\"5\"class=\"dinylight-color\" style=\"cursor:pointer;border-radius:2px;height:35px;width:12%;border:0px solid white;\">尾页</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t");

		}else{
				 
				  
      out.write("<div id=\"tidings\" class=\"small-font\" style=\"text-align: center; line-height: 200px; border-bottom: 0; color: gainsboro;\"><font>您暂无作业消息</font></div>");
 
			  }
	    
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"js/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>\r\n");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2021-02-04 10:44:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.get_mission_user_finished;
import java.util.StringTokenizer;

public final class Assignment_005ffinished_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bean.get_mission_user_finished");
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
修改人			     
修改时间 		
修改内容		
版本号			 
-------------------------------------------------------------------------------------------------*/
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Public_style.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"Css/Assignment.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"./Css/Public_Color/orange.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\t");
  
		String lastpage=request.getParameter("lastpage");
		String lastpages="Assignment.jsp";
		if("1".equals(lastpage))
		{
			lastpages="score.jsp";
		}
		else 
		{
			lastpages="Assignment.jsp";
		}
		String ID=null;
		if(request.getAttribute("ID")!=null){
			ID=(String)request.getAttribute("ID");
		}
		if(request.getParameter("ID")!=null){
			ID=request.getParameter("ID");
		}
		String missionID=null;
		if(request.getAttribute("missionID")!=null){
			missionID=(String)request.getAttribute("missionID");
		}
		if(request.getParameter("missionID")!=null){
			missionID=request.getParameter("missionID");
		}
		String missiondate=request.getParameter("missiondate");
		System.out.println("missionID:"+missionID+"ID:"+ID+"missiondate:"+missiondate);
		get_mission_user_finished mission=new get_mission_user_finished();
		String nowpage=null;
		if(request.getAttribute("nowpage")!=null){
			nowpage=(String)request.getAttribute("nowpage");
		}
		else if(request.getParameter("nowpage")!=null)
		{
			nowpage=(String)request.getParameter("nowpage");
		}
		else 
		{
			nowpage="1";
		}
		System.out.println("nowpage:"+nowpage);
		System.out.println("完成页面传入的missiondate:"+missiondate);
		mission.getmissioninf(missionID, ID, missiondate,nowpage);
		StringTokenizer chart1=new StringTokenizer(mission.alldate,"@");
		StringTokenizer chart2=new StringTokenizer(mission.missioninf,"晸郶蔖");
		StringTokenizer chart3=new StringTokenizer(mission.finishedinf, "晸郶蔖");
		mission.con.close();
		mission.con2.close();
	
      out.write("\r\n");
      out.write("\t<body bgcolor=\"#F4F5F7\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!--头部信息-->\r\n");
      out.write("\t\t<div class=\"Details_whole_block\" style=\"width:75%;margin-top:0px;\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(lastpages );
      out.write("\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t&nbsp;┃&nbsp;任务:");
      out.print(chart2.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t<img src=\"img/lead_photo/返回.png\" style=\"width:30px;height:25px;float:right;\">\r\n");
      out.write("\t\t\t\t\t<input name=\"ID\" value=\"");
      out.print(ID );
      out.write("\" type=\"text\"style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t<button name=\"setlocal\" value=\"1\" style=\"height:100%;float:right;width=35px;border:0px solid white;background:#FAFAFA;\" class=\"middle-font font-normal-color\">\r\n");
      out.write("\t\t\t\t\t\t返回上一级\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;width:49.9%;margin-right:0.2%;\">\r\n");
      out.write("\t\t\t\t&nbsp;┃&nbsp;任务详情\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;width:49.9%;\">\r\n");
      out.write("\t\t\t\t&nbsp;┃&nbsp;作业评价\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:49.9%;margin-right:0.2%;height:150px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t<textarea style=\"color:white;background-color:#FFCAB0;font-size:20px;resize:none;width:100%;height:100%;margin:0 auto;\"\r\n");
      out.write("\t\t\t\t readonly>&nbsp;&nbsp;");
      out.print(chart2.nextToken() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:49.9%;height:150px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t<textarea style=\"color:white;background-color:#FFCAB0;font-size:20px;resize:none;width:100%;height:100%;margin:0 auto;\"\r\n");
      out.write("\t\t\t\t readonly>&nbsp;&nbsp;");
      out.print(chart3.nextToken() );
      out.write(" </textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"body_block dinylight-color\" style=\"margin-top:3px;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div style=\"width:20%;float:left;height:100%;\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;发布日期\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white;  margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(chart2.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;截止日期\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(chart2.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;已完成人数\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t150\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;评分\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(chart3.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;考核类型\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(chart2.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;语言类型\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"light-color\" style=\"color:white; margin-bottom:3px; width:100%;height:50px;float:left;text-align:center;line-height:50px;\">\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(chart2.nextToken() );
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:59.9%;height:100%;margin-left:0.1%;background-color:white;float:left;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;提交内容\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<textarea style=\"width:100%;height:476px;margin:0 auto;resize:none;font-size:10px;\" readonly>");
      out.print(chart3.nextToken() );
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"width:19.9%;height:100%;margin-left:0.1%;background-color:white;float:left;\">\r\n");
      out.write("\t\t\t\t\t<div class=\"small-tittle middle-font font-normal-color\" style=\"margin-bottom:2px;float:left;\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;┃&nbsp;往期提交内容\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form action=\"Assignment_finished_details.jsp\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"lastpage\" value=\"");
      out.print(lastpage );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"ID\" value=\"");
      out.print(ID );
      out.write("\"type=\"text\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"missionID\" value=\"");
      out.print(missionID );
      out.write("\"type=\"text\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"nowpage\" value=\"");
      out.print(nowpage );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width:100%;height:460px;\">\r\n");
      out.write("\t\t\t\t\t\t");

							int num=chart1.countTokens();
						String color="";
							for(int a=0;a<num;a++){
								String date=chart1.nextToken();
								if(date.equals(mission.nowdate) ){
									color="#FFA980;border:1px solid gray;";
								}else
								if(a%2==0){
									color="#FFCAB0;";
								}else {
									color="#FAFAFA;";
								}
								
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<button style=\"width:100%;height:35px;border:0px solid white;background-color: ");
      out.print(color);
      out.write(" \" name=\"missiondate\"value=\"");
      out.print(date );
      out.write('"');
      out.write('>');
      out.print(date );
      out.write(" </button>\r\n");
      out.write("\t\t\t\t\t\t");

							} 
						
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t\t</form>\t\r\n");
      out.write("\t\t\t\t\t<form action=\"finished_mission_page\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input name=\"ID\" value=\"");
      out.print(ID );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"missionID\" value=\"");
      out.print(missionID );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"allpage\" value=\"");
      out.print(mission.allpagenum );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<input name=\"nowpage\" value=\"");
      out.print(nowpage );
      out.write("\" style=\"display:none;\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width:100%;\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t\t<font >第");
      out.print(nowpage );
      out.write('页');
      out.write('/');
      out.write('共');
      out.print(mission.allpagenum );
      out.write("页\r\n");
      out.write("\t\t\t\t\t\t\t</font> <br />\r\n");
      out.write("\t\t\t\t\t\t\t<button name=\"act\"value=\"1\"  style=\"background-color: #FFCAB0;  width: 23%; height: 30px; border-radius: 5px; border: 0px solid lightgray;\">上一页</button>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"topage\"  style=\"width: 23%;height: 30px;border-radius:5px;background-color:#FFCAB0;border:0px solid white;\" >\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"");
      out.print(nowpage );
      out.write('"');
      out.write('>');
      out.print(nowpage );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								for(int c=0;c<mission.allpagenum;c++)
								{ 
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"");
      out.print(c+1 );
      out.write('"');
      out.write('>');
      out.print(c+1 );
      out.write("</option>\r\n");
      out.write("\t\t\t\t\t\t\t");

								} 
							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t<button name=\"act\"value=\"2\" style=\"background-color: #FFCAB0;  width: 23%; height: 30px; border-radius: 5px; border: 0px solid lightgray;\">跳转</button>\r\n");
      out.write("\t\t\t\t\t\t\t<button name=\"act\"value=\"3\" style=\"background-color: #FFCAB0;  width: 23%; height: 30px; border-radius: 5px; border: 0px solid lightgray;\">下一页</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
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

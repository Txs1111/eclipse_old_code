package Get_Message;

import java.sql.*;

public class Get_Message {

	Connection con = null; // 创建数据库对象
	ResultSet rs = null;
	PreparedStatement ps = null;
	Statement stmt = null;
	String sql = null;
	int exist = 0;

	public void Get_Message(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("######获取驱动成功######");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql:"
					+ "//localhost:3306/Type_Speed?serverTimezone=Asia/Shanghai&userEnicode=true;characterEncoding=UTF-8; ",
					"root", "");
			System.out.println("######连接成功######");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String IP = ;
		String Username = request.getParameter("Username");		//姓名
		/*String Sex = request.getParameter("Sex");		//性别
		String Phone_Number = request.getParameter("Phone_Number");	//手机号
		String Student_Number = request.getParameter("Student_Number");//学号
		String College = request.getParameter("College");	//学院
		String Major = request.getParameter("Major");	//专业
		String Class = request.getParameter("Class");	//班级
		String Department = request.getParameter("Department");		//部门
		String Hobby = request.getParameter("Hobby");			//爱好
		String Technology = request.getParameter("Technology");	//曾经学过的技术
		*/System.out.println("用户信息读取完毕");
		
		
		if (Username == null 
				/*|| Sex == null 
				|| Phone_Number == null 
				|| Student_Number == null 
				|| College == null 
				|| Major == null
				|| Class == null 
				|| Department == null 
				|| Hobby == null 
				|| Technology == null */) {	//有空字段
				System.out.println("信息不完整，请重新输入。");
		}else if(Username == null 
				/*&& Sex != null 
				&& Phone_Number != null 
				&& Student_Number != null 
				&& College != null 
				&& Major != null
				&& Class != null 
				&& Department != null 
				&& Hobby != null 
				&& Technology != null */){
			sql = "INSERT INTO Typing_Speed(Username,Student_Number,Typing_Speed) VALUES (?,?,?);";
			ps.setString(1, Username);
			/*System.out.println("。。。8%");
			ps.setString(2, Sex);
			System.out.println("。。。19%");
			ps.setString(4, Phone_Number);
			System.out.println("。。。28%");
			ps.setString(5, Student_Number);
			System.out.println("。。。37%");
			ps.setString(6, College);
			System.out.println("。。。49%");
			ps.setString(7, Major);
			System.out.println("。。。58%");
			ps.setString(8, Class);
			System.out.println("。。。68%");
			ps.setString(9, Department);
			System.out.println("。。。80%");
			ps.setString(10, Hobby);
			System.out.println("。。。91%");
			ps.setString(11, Technology);*/
			System.out.println("。。。100%");
			System.out.println("信息输入储存完毕");
			ps = con.prepareStatement(sql);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from get_message");
			while(rs.next()){
				System.out.println("Username:" + Username);
				if (Username == rs.getString("Username")) { //用户已注册
					System.out.println("该用户已存在");
					exist = 1;		//用户已存在
				}
			}
			if(exist == 0){	//用户不存在
				ps.executeUpdate(sql);
			}
		}
	}

}

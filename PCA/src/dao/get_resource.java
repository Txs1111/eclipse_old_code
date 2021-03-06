package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * @author Lyon 获取学习资源类
 */

public class get_resource {

	/**
	 * @param nu
	 */
	public get_resource(int nu) {
		super();
		this.nu = nu;
	}

	/**
	 * 
	 */
	public get_resource() {
		super();
	}

	int nu = 0;
	/**
	 * 存储数据库所有数据的对象头
	 */
	resource_entity allhead;
	/**
	 * 存储数据库中所有数据的对象链表
	 */
	resource_entity allnode;
	/**
	 * 获取数据库中所有语言框架的类型
	 */
	public ArrayList<String> alltype = new ArrayList<>();
	/**
	 * 获取数据库中对应语言框架的类型的代号
	 * 使用方法：alltype.get(0)==>java，其数量为type_daihao.get(0)==>java的资源代号
	 */
	public ArrayList<String> type_daihao = new ArrayList<>();
	/**
	 * 获取数据库中对应语言框架的类型的数量
	 * 使用方法：alltype.get(0)==>java，其数量为type_number.get(0)==>java的资源数量
	 */
	public ArrayList<Integer> type_number = new ArrayList<>();
	/**
	 * 获取数据库中对应语言框架的类型的图片地址
	 * 使用方法：alltype.get(0)==>java，其数量为type_url.get(0)==>java的资源图片地址
	 */
	public ArrayList<String> type_url = new ArrayList<>();
	/**
	 * 获取数据库中所有资源途径的类型（eg：百度网盘，哔哩哔哩）
	 */
	public ArrayList<String> allpath = new ArrayList<>();
	/**
	 * 获取数据库中对应资源途径的类型（eg：百度网盘，哔哩哔哩）的代号
	 * 使用方法：allpath.get(0)==>百度网盘，其数量为path_daihao.get(0)==>百度网盘的资源代号
	 */
	public ArrayList<String> path_daihao = new ArrayList<>();
	/**
	 * 获取数据中对应资源途径的类型（eg：百度网盘，哔哩哔哩）的数量
	 * 使用方法：allpath.get(0)==>百度网盘，其数量为path_number.get(0)==>百度网盘的资源数量
	 */
	public ArrayList<Integer> path_number = new ArrayList<>();
	/**
	 * 获取数据中对应资源途径的类型（eg：百度网盘，哔哩哔哩）的图片地址
	 * 使用方法：allpath.get(0)==>百度网盘，其数量为path_url.get(0)==>百度网盘的资源图片地址
	 */
	public ArrayList<String> path_url = new ArrayList<>();

	/**
	 * 获取数据库中所有学习资源
	 * 
	 * @throws Exception
	 */
	public resource_entity allResource() throws Exception {
		MySQL_connect con = new MySQL_connect();
		String sql = "select * from learning_resource learning_resource_dictionaries order by time desc,uid desc";
		/**
		 * 数据库中所有总资源数
		 */
		int allnumber = 0;
		try {
			ResultSet rs = con.usercommend.executeQuery(sql);
			boolean a = true;
			while (rs.next()) {
				allnumber = allnumber + 1;
				if (a) {
					allnode = new resource_entity(rs.getString("uid"), rs.getString("ID"), rs.getString("title"),
							rs.getString("content"), rs.getString("verification"), rs.getString("time"),
							rs.getString("type"), rs.getString("path"), rs.getString("ifcheck"));
					allhead = allnode;
					a = false;
				} else {
					allnode.next = new resource_entity(rs.getString("uid"), rs.getString("ID"), rs.getString("title"),
							rs.getString("content"), rs.getString("verification"), rs.getString("time"),
							rs.getString("type"), rs.getString("path"), rs.getString("ifcheck"));
					allnode = allnode.next;
				}
			}
			allhead.setNumber(allnumber);
			/**
			 * 获取数据库中的所有资源类型
			 */
			String sqltype = "select type_name,type,type_url from learning_resource_dictionaries where type_name!='null'";
			rs = con.usercommend.executeQuery(sqltype);
			// 清除公共缓存
			for (int i = 0; i < alltype.size(); i++) {
				alltype.set(i, null);
				type_number.set(i, 0);
				type_daihao.set(i, null);
				type_url.set(i, null);
			}
			while (rs.next()) {
				alltype.add(rs.getString("type_name"));
				type_number.add(0);
				type_daihao.add(rs.getString("type"));
				type_url.add(rs.getString("type_url"));
			}
			/**
			 * 获取数据库中的所有资源方式
			 */
			String sqlpath = "select path_name,path,path_url from learning_resource_dictionaries where path_name!='null'";
			rs = con.usercommend.executeQuery(sqlpath);
			// 清除公共缓存
			for (int i = 0; i < allpath.size(); i++) {
				allpath.set(i, null);
				path_number.set(i, 0);
				path_daihao.set(i, null);
				path_url.set(i, null);
			}
			while (rs.next()) {
				allpath.add(rs.getString("path_name"));
				path_number.add(0);
				path_daihao.add(rs.getString("path"));
				path_url.add(rs.getString("path_url"));
			}
			rs.close();
			con.usermysql.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 获取今天更新的资源数
		 */
		if (allhead == null || allhead.equals(null))
			allhead = new resource_entity(0);
		return allhead;
	}

	/**
	 * @return 获取已合格的学习资源
	 */
	public resource_entity resource() {
		// 清除公共缓存
		for (int j = 0; j < alltype.size(); j++) {
			type_number.set(j, 0);
		}
		// 清除公共缓存
		for (int j = 0; j < allpath.size(); j++) {
			path_number.set(j, 0);
		}
		resource_entity node = allhead;
		resource_entity date = allhead;
		resource_entity head = node;
		/**
		 * 合格的总资源数
		 */
		int number = 0;
		boolean a = true;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getIfcheck().equals("1")) {
				number = number + 1;
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
				/**
				 * 获取数据库中所有语言框架的类型的数量操作
				 */
				for (int j = 0; j < alltype.size(); j++) {
					if (date.getType().equals(type_daihao.get(j))) {
						type_number.set(j, type_number.get(j) + 1);
						break;
					}
				}
				/**
				 * 获取数据库中所有类型途径（eg：百度网盘，哔哩哔哩）的数量操作
				 */
				for (int j = 0; j < allpath.size(); j++) {
					if (date.getPath().equals(path_daihao.get(j))) {
						path_number.set(j, path_number.get(j) + 1);
						break;
					}
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		head.setNumber(number);
		return head;
	}

	/**
	 * @return 获取待检查是否合格的的学习资源
	 */
	public resource_entity checkSubmitResource() {
		resource_entity node = null;
		resource_entity date = allhead;
		resource_entity head = node;
		/**
		 * 提交的更新资源数量
		 */
		int check_submit_number = 0;
		boolean a = true;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getIfcheck().equals("3")) {
				check_submit_number = check_submit_number + 1;
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		head.setNumber(check_submit_number);
		return head;
	}

	/**
	 * @return 获取他们点击的过期学习资源
	 */
	public resource_entity checkDieResource() {
		resource_entity node = null;
		resource_entity date = allhead;
		resource_entity head = node;
		boolean a = true;
		/**
		 * 提交的失效资源数量
		 */
		int check_die_number = 0;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getIfcheck().equals("2")) {
				check_die_number = check_die_number + 1;
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		head.setNumber(check_die_number);
		return head;
	}

	/**
	 * @return 获取所有的过期学习资源
	 */
	public resource_entity DieResource() {
		resource_entity node = null;
		resource_entity date = allhead;
		resource_entity head = node;
		boolean a = true;
		/**
		 * 所有的失效资源数量
		 */
		int die_number = 0;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getIfcheck().equals("-1")) {
				die_number = die_number + 1;
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		head.setNumber(die_number);
		return head;
	}

	/**
	 * @return 获取所有的不合格学习资源
	 */
	public resource_entity errorResource() {
		resource_entity node = null;
		resource_entity date = allhead;
		resource_entity head = node;
		boolean a = true;
		/**
		 * 所有的不合格资源数量
		 */
		int error_number = 0;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getIfcheck().equals("0")) {
				error_number = error_number + 1;
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		head.setNumber(error_number);
		return head;
	}

	/**
	 * 获取今天更新的资源数
	 * 
	 * @throws Exception
	 */
	public int newTodayNumber() throws Exception {
		/**
		 * 今天更新的资源数
		 */
		int today_new_number = 0;
		resource_entity head = resource();
		int number = head.number;
		for (int i = 0; i < number; i++) {
			if (compare_time(head.time, 1)) {
				today_new_number = today_new_number + 1;
			}
			if (number - i != 1)
				head = head.next;
		}
		return today_new_number;
	}

	public int dieTodayNumber() throws Exception {
		/**
		 * 今天失效的资源数
		 */
		int today_die_number = 0;
		resource_entity head = DieResource();
		int number = head.number;
		for (int i = 0; i < number; i++) {
			if (compare_time(head.time, 1)) {
				today_die_number = today_die_number + 1;
			}
			if (number - i != 1)
				head = head.next;
		}
		return today_die_number;
	}

	/**
	 * @param tableTime
	 * @param time
	 * @return
	 * @throws Exception
	 *             当时间小于上传的time时间时，返回true
	 */
	public boolean compare_time(String tableTime, int time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d HH:mm:ss");
		Date start;
		try {
			start = sdf.parse(tableTime);
			Date end = new Date();
			long cha = end.getTime() - start.getTime();
			if (cha < 0) {
				return false;
			}
			double result = cha / (1000 * 60 * 60 * 24);
			if (result < time) {
				return true;
			} else {
				return false;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * @param ID
	 * @return 获取用户的昵称
	 */
	public String getName(String ID) {
		String name = null;
		String sql = "select nickiname from user_data where user_data.ID=" + ID;
		MySQL_connect con = new MySQL_connect();
		try {
			ResultSet rs = con.usercommend.executeQuery(sql);
			rs.next();
			name = rs.getString("nickiname");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	/**
	 * 提交资源
	 */
	public void uploading(String ID, String title, String content, int type, int path) {
		MySQL_connect con = new MySQL_connect();
		String verification = null;
		String Content = content;
		verification = split(content, path);
		String sql = "insert into learning_resource (ID,title,content,verification,time,type,path,ifcheck) values(" + ID
				+ "," + title + "," + Content + "," + verification + ",localtime()," + type + "," + path + ",3);";
		System.out.println("*******" + sql);
		try {
			con.usercommend.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param content
	 *            将内容切分为
	 */
	public String split(String content, int path) {
		// TODO Auto-generated method stub
		String verification = null;
		if (path == 1) {
			StringTokenizer chart = new StringTokenizer(content, "取码:");
			chart.nextToken();
			verification = chart.nextToken();
		} else if (path == 2)

		{
			verification = "' '";
		}
		return verification;
	}

	/**
	 * @param uid
	 *            修改为资源合格方法
	 */
	public void yes(String uid) {
		MySQL_connect con = new MySQL_connect();
		String sql = "update learning_resource set ifcheck=1 where uid=" + uid;
		try {
			con.usercommend.executeUpdate(sql);
			con.usercommend.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uid
	 *            修改为资源不合格方法
	 */
	public void no(String uid) {
		MySQL_connect con = new MySQL_connect();
		String sql = "update learning_resource set ifcheck=0 where uid=" + uid;
		try {
			con.usercommend.executeUpdate(sql);
			con.usercommend.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uid
	 *            修改为资源过期方法
	 */
	public void die(String uid) {
		MySQL_connect con = new MySQL_connect();
		String sql = "update learning_resource set ifcheck=-1 where uid=" + uid;
		try {
			con.usercommend.executeUpdate(sql);
			con.usercommend.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uid
	 *            用户提交资源
	 */
	public void chick_submit(String uid) {
		MySQL_connect con = new MySQL_connect();
		String sql = "update learning_resource set ifcheck=3 where uid=" + uid;
		try {
			con.usercommend.executeUpdate(sql);
			con.usercommend.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param uid
	 *            用户说资源过期了
	 */
	public void check_die(String uid) {
		MySQL_connect con = new MySQL_connect();
		String sql = "update learning_resource set ifcheck=2 where uid=" + uid;
		try {
			con.usercommend.executeUpdate(sql);
			con.usercommend.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param pathdaihao
	 * @return 获取同渠道的所有资源
	 */
	public resource_entity same_path(int pathdaihao) {
		resource_entity node = null;
		resource_entity date = allhead;
		resource_entity head = node;
		boolean a = true;
		for (int i = 0; i < allhead.number; i++) {
			if (date.getPath().equals(pathdaihao)) {
				if (a) {
					node = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getType(), date.getType(), date.getPath(), date.getIfcheck());
					head = node;
					a = false;
				} else {
					node.next = new resource_entity(date.getUid(), date.getID(), date.getTitle(), date.getContent(),
							date.getVerification(), date.getTime(), date.getType(), date.getPath(), date.getIfcheck());
					node = node.next;
				}
			}
			date = date.next;
		}
		if (head == null || head.equals(null))
			head = new resource_entity(0);
		return head;
	}

	/**
	 * @return 获取内容a链接
	 */
	public String get_a(String content) {
		String a = "#";
		StringTokenizer chart = new StringTokenizer(content, "接：");
		chart.nextToken();
		a = chart.nextToken();
		System.out.println(a);
		return a;
	}

}

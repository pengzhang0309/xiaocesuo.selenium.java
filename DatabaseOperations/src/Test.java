import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection ct = DriverManager.getConnection("jdbc:mysql://localhost:3306/humanresources", "root", "M@crowill");
		Statement stmt = ct.createStatement();
		
		//查看员工信息
		System.out.println("查看员工信息");
		System.out.println("======================================");
		ResultSet rs = stmt.executeQuery("select * from Employee");
		int a = 1;
		String employeeCode = null, employeeName = null, employeeLastLoginDate = null;
		while(rs.next())
		{
			employeeCode = rs.getString(2);
			employeeName = rs.getString(3);
			employeeLastLoginDate = rs.getString(5);
			System.out.println("第" + a + "个员工信息: " + employeeCode + " " +employeeName + " " + employeeLastLoginDate);
			a++;
		}
		
		//新增员工
		/*int b = stmt.executeUpdate("insert into Employee values(EmployeeId, '1004', 'Tester Four', '321', '2017-10-07', 0)");  
		if(b == 1)
		{
			if(b == 1)
				System.out.println("添加成功");
			else
				System.out.println("添加失败");
		}*/
		
		//删除员工
		/*int c = stmt.executeUpdate("delete from Employee where EmployeeCode = '1004'");
		if(c == 1)
			System.out.println("删除成功");
		else
			System.out.println("删除失败");*/
		
		
		//更新员工
		/*int d = stmt.executeUpdate("update Employee set isDeleted = 1 where employeeCode = '1004'");
		if(d == 1)
			System.out.println("更新成功");
		else
			System.out.println("更新失败");*/
		
	}

}

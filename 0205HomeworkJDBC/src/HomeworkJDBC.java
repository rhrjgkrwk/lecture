import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
-. ���̺���
   �ʵ�, �÷���, pk, fk,� ���� �����Ͻÿ�

-. ���̺� �����

    ��ǰ���̺�

  ��ǰ��ȣ ���� 5, ��ǰ�� ���� 20, 
 ��������  ��¥, ��ǰ���� ���� 


  1) ���̺���ÿ�
  2)  �ڷḦ 5�� �Է��Ͻÿ�
  3) ������ ��� 20% �λ��Ͻÿ�
  4) ��ǰ �� �ϳ��� ����ÿ�

-. �Ի����� 2005�� ������ �Ի��ϰ� �޿��� 
   5000�̻��� ����� id, �̸�, �Ի��� ,�޿�
   �� ����ϴ� jdbc ���α׷��� �ۼ��Ͻÿ�   
*/  


public class HomeworkJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String sql = "SELECT employee_id, first_name, last_name, hire_date, salary"
				+ " FROM employees"
				+ " WHERE hire_date < \'20050101\' and salary >= 5000";
		Connection con = null;
		Class.forName	("oracle.jdbc.driver.OracleDriver"); 
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt("employee_id");
			String fname = rs.getString("first_name");
			String lname = rs.getString("last_name");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��M��d��");
			String hdate = sdf.format(rs.getTimestamp("hire_date"));
			int sal = rs.getInt("salary");
			System.out.println(id+"\t"+fname+" "+lname+"\t"+hdate+"\t"+sal+"$");
		}
		con.close();
	}
}

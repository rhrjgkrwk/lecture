package workshop.factory;

public class Test06 {
	public static void main(String[] args) {
		new FactoryBiz("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@127.0.0.1:1521:xe", "credu", "credu").getFactoryAll();;
	}
}	

package Day9;

public class MyInterfaceMain {

	public static void main(String[] args) {
		MySQL sql=new MySQL();
		OracleDB oracle=new OracleDB();
		
		sql.connect();
		oracle.connect();
	}

}

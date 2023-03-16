package Day9;

public class OracleDB implements MyInterface {

	@Override // Annotation
	public void connect() {
		System.out.println("Connecting Oracle DB");
	}

}

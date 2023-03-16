package Day21;

import java.io.Serializable;

public class Student implements Serializable {
	private String sname;
	private float average;
	private int Sno;
	
	
	public void StudentDetails() {
		System.out.println("Student [Student name: " + sname + " Average=" + average + " Roll no.=" + Sno + "]");
	}

	public Student(int Sno, String sname, float average) {
		super();
		this.Sno = Sno;
		this.sname = sname;
		this.average = average;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		this.Sno = Sno;
	}
	
	
}

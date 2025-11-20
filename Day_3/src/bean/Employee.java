package bean;

import java.time.LocalDate;

public class Employee {
	int eId;
	String eName;
	LocalDate ldt;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eId, String eName, LocalDate ldt) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.ldt = ldt;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public LocalDate getldt() {
		return ldt;
	}
	public void setldt(LocalDate ldt) {
		this.ldt = ldt;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", jDate=" + ldt + "]";
	}
	
	
	
}

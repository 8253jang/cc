package sample02;
/**

*/
public class PartTime extends Employee {
	private int timePay;
	
	public PartTime() {}
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}
	
	public int getTimePay() {
		return timePay;
	}
	
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" | ");
		sb.append(getTimePay());
		
		return super.toString() + sb.toString();
	}
	
	@Override
	public void message() {
		System.out.println(super.geteName()+ " 비정규직사원입니다.");
		
	}

}

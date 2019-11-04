package sample02;
/**

*/
public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	public FullTime() {}
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" | ");
		sb.append(getSalary());
		sb.append(" | ");
		sb.append(getBonus());
		
		return super.toString() + sb.toString();
	}
	
	@Override
	public void message() {
		System.out.println(super.geteName()+" 정규직사원입니다.");
		
	}

}

package sample02;
/**

*/


public class MainApp {
	public static void main(String[] args) {
		Employee[] em = new Employee[5];
		
		em[0] = new FullTime(10, "���缮", "���׸�", 0 , "2013-05-01", "���ѵ���",8500,200);
		em[1] = new FullTime(20, "�ڸ��", "����",10, "2013-06-20", "���ѵ���",7500,100);
		em[2] = new FullTime(30, "������", "������",10 , "2013-06-22", "���ѵ���",6000,0);
		
		em[3] = new PartTime(40, "��ȫö", "������",20 , "2014-05-01", "���ѵ���",20000);
		em[4] = new PartTime(50, "����", "����",30 , "2014-05-02", "���ѵ���",25000);
		
		System.out.println("***************** Emp ��� *****************");
		for(Employee e : em) {
			System.out.println(e);//e.toString()
		}
		
		System.out.println("***************** Emp Message *****************");
		for(Employee e : em) {
			e.message();
		}
	}

}

package sample02;
/**

*/


public class MainApp {
	public static void main(String[] args) {
		Employee[] em = new Employee[5];
		
		em[0] = new FullTime(10, "유재석", "개그맨", 0 , "2013-05-01", "뮤한도전",8500,200);
		em[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		em[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		em[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		em[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		
		System.out.println("***************** Emp 사원 *****************");
		for(Employee e : em) {
			System.out.println(e);//e.toString()
		}
		
		System.out.println("***************** Emp Message *****************");
		for(Employee e : em) {
			e.message();
		}
	}

}

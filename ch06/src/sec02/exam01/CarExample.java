package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car s1 = new Car();
		//Car 클래스 자료형
		//s1 객체?
		//Car() <-클래스 생성자 호출
		System.out.println(s1.company);
		System.out.println(s1.model);
		System.out.println(s1.color);
		System.out.println(s1.maxSpeed);
		System.out.println(s1.speed);
		
		s1.speed=60;
		System.out.println(s1.speed);
	}

}

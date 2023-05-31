package sec01.exam06;

public class Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed +=1;
	}
	
	//final 메소드 (재정의x, 오버라이딩x)
	public final void stop() {
		System.out.println("멈춰");
		speed = 0;
	}
}

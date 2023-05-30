package sec06.exam06;

public class CarExample {
	
	public static void main(String[] args) {
		Car myCar = new Car();
		
		//잘못된 속도변경
		myCar.setSpeed(-50);		
		System.out.println(myCar.getSpeed());
		
		//올바른
		myCar.setSpeed(60);
		
		//멈춰
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println(myCar.getSpeed());
	}
}

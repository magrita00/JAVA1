package sec01.exam06;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed+=10;
	}
	/*@Override (final method라 상속이 안됨)
	public void stop() {
		System.out.println("멈춤");
		speed=0;
	}*/
}

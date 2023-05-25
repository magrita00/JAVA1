package sec04.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("filling");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("full");
		}else {
			System.out.println("soldout");
		}
	}

}

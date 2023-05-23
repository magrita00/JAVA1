package sec04.exam01;

public class Calculator {
	//메소드
	void powerOn() {
		System.out.println("Power On");
	}
	
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	double divide(int x,int y) {
		double result=(double)x/(double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("Power Off");
	}

	public double divide(double x, double y) {
		double result=(double)x/(double)y;
		return result;
	}
}

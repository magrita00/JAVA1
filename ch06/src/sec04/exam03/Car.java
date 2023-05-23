package sec04.exam03;

public class Car {
	//field
	int gas;
	
	//생성자
	
	//method
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("out of stock");
			return false;
		}
		System.out.println("we have stock");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("fill in "+gas);
				 gas-=1;
			} else {
				System.out.println("stop "+gas);
				return;
			}
		}
	}
}

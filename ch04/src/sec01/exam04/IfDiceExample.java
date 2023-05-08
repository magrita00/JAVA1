package sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {
		//1~50까지 난수: (int)(Math.random()*49+1);
		//로또: (int)(Math.random()*44+1)
		// Math.random():  0.xxx~5.xxx
		int num=(int)(Math.random()*6+1);
		
		if(num==1) {
			System.out.println("1");		
		} else if (num==2){
			System.out.println("2");
		} else if (num==3) {
			System.out.println("3");
		} else if (num==4) {
			System.out.println("4");
		} else if (num==5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}
		
	}

}

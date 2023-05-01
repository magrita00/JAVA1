package sec01.exam01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		int value = 20;
		int result = value + 10;
		System.out.println(result);
		
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
			
	}

}

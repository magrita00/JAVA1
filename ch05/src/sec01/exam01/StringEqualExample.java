package sec01.exam01;

public class StringEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1="bear";
		String strVar2="bear";	
				
		if(strVar1 == strVar2) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("같음");
		}
		
		String strVar3=new String("BEAR");
		String strVar4=new String("BEAR");
		
		if(strVar3==strVar4) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
			
		}
		if(strVar3.contentEquals(strVar4)) {
			System.out.println("같음");
		}
	}

}

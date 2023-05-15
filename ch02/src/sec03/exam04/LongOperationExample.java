package sec03.exam04;

public class LongOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value1=10;
		int value2=100;
		long value3=1000L;
		long result=value1+value2+value3; //변수 큰 범위 long으로 변환됨
		//byte result=value1+value2+value3; //byte는 0~127(양수) 범위가 좁아서 에러남
		System.out.println(result);
	}

}

package sec02.exam06;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("변환 성공");
		} else {
			System.out.println("변환 실패");
		}
	}
	public static void method2(Parent parent) {
			Child child = (Child) parent;
			System.out.println("Child2 변환 성공");
	} 
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		//method2(parentB); 예외 처리를 해 줄것
	}
}

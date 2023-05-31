package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child=new Child();
		Parent parent=child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); //부모 클래스로 타입 변환이 완료되어 더 이상 .method3() 사용할 수 없음
	}
}

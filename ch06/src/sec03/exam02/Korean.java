package sec03.exam02;

public class Korean {
	//필드
	String nation="대한민국";
	String name;
	String ssn;
	
	//생성자
	public Korean(String name, String s) {
		this.name = name;
		//this는 인스턴스, .name은 필드
		//동일한 매개변수를 갖고 있을 때 (예: 국내 사용자만 있는 앱) static으로 하나로 묶어서 메모리를 절약함 -> 개념은 이해가 되는데...뭔 말인지...
		this.ssn = ssn;
	}
}

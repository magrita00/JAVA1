package sec02.exam04;

public class CharExample {
	public static void main(String[] args) { //ma + ctrl + space + enter 단축키
		char c1='A'; //char에서는 ''만 컴파일 됨 ""(x)
		char c2=65;
		char c3='\u0041';
		
		char c4='가';
		char c5=44032;
		char c6='\uac00';
		
		char c7=97; //소문자 a
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
	}
}

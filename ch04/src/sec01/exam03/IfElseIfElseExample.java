package sec01.exam03;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=101;
		
		if (score>100){
			System.out.println("점수는 100점이 만점입니다");
		}else if(score>=90) {
			System.out.println("점수가 100~90");
			System.out.println("동급은 A");
		} else if(score>=80) {
			System.out.println("점수가 80~89");
			System.out.println("등급은 B");
		} else if(score>=70) {
			System.out.println("점수가 70~79");
			System.out.println("등급은 C");
		} else {
			System.out.println("점수가 70점 미만");
			System.out.println("등급은 D");
		}
	}

}

package sec02.exam01;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83,90,87}; //선언과 동시에 값을 집어 넣는 방법
		
		//int[] scores1;
		//scores1= {83,90,87} //변수처럼 먼저 선언을 하고 나중에 값을 넣는 것은 안됨
		
		int[]scores1;
		scores1=new int[] {83,90,98}; //위랑 같은데 참조변수 선언하듯 값을 넣는 것은 됨
				
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		int sum=0;
		for(int i=0;i<3;i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		double avg=(double)sum/3;
		System.out.println(avg);
	}
}

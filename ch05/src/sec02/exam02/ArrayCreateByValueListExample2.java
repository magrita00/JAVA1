package sec02.exam02;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores=new int[] {83,90,87};
		int sum=0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
		}
		System.out.println(sum);
		
		int sum2=add(new int[] {83,90,87});
		System.out.println(sum2);
	}
	public static int add(int[] scores) {//var scores
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=scores[i];
		}
		return sum;
	}
}

package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v2=1;
		double v3=1.0;
		System.out.println(v2==v3);
		
		double v4=0.1; //소수점 16자리까지
		float v5=0.1f; //소수점 7자리까지 (double보다 수치상 오차가 더 큼)
		System.out.println(v4==v5);
		System.out.println((float)v4==v5);
		System.out.println((int)(v4*10)==(int)(v5*10));
	}

}

package sec02.exam06;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0;i<mathScores.length;i++) {
			for(int k=0;k<mathScores[i].length;k++) {
				System.out.println("["+i+"],["+k+"]="+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] engScores = new int[2][];
		engScores[0]=new int[3];
		engScores[1]=new int[3];
		
		for(int i=0;i<engScores.length;i++) {
			for(int k=0;k<engScores[i].length;k++) {
				System.out.println("["+i+"],["+k+"]="+engScores[i][k]);
			}
		}
		engScores[0][2]=10;
		System.out.println(engScores[1].length);
		System.out.println(engScores[0][2]);
	}
}

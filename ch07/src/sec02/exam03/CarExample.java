package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car=new Car();
		
		for(int i=1;i<=5;i++) {
			int problemLocation=car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("전좌 타이어 교체");
				car.frontLeftTire=new HankookTire("전좌", 15);
				break;
			case 2:
				System.out.println("전우 타이어 교체");
				car.frontRightTire=new KumhoTire("전우", 13);
				break;
			case 3:
				System.out.println("후좌 타이어 교체");
				car.backLeftTire=new HankookTire("후좌", 14);
				break;
			case 4:
				System.out.println("후우 타이어 교체");
				car.backRightTire=new KumhoTire("후우", 17);
				break;
			}
			System.out.println("--------------------");
		}
	}
}

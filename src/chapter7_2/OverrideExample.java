package chapter7_2;

public class OverrideExample {
	public static void main(String[] args) {
		Point p = new Point();
		p.x = 5;
		p.y = 10;
		p.printInfo();
//		PointのインスタンスメソッドprintInfoを使用している
		System.out.println("==================");

		ColorPoint cp = new ColorPoint();
		cp.x = 2;
		cp.y = 4;
		cp.color = "red";
		cp.printInfo();
//		ColorPointにオーバーライドされたインスタンスメソッドprintInfoを使用している
	}

}

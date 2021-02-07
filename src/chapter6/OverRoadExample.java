package chapter6;

public class OverRoadExample {
	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")です");
		System.out.println("=================================");
		p1.set(10,0);
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")です");
		System.out.println("=================================");
		Point p2 = new Point();
		p2.set(p1);
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")です");
	}

}

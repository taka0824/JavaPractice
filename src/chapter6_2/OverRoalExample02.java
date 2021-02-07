package chapter6_2;

public class OverRoalExample02 {
	public static void main(String[] args) {
		Point p1 = new Point();
//		引数がないコンストラクタを使用
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")です");

		System.out.println("========================================");

		Point p2 = new Point(10, 5);
//		引数が2つのコンストラクタを使用
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")です");

		System.out.println("========================================");
		
		Point p3 = new Point(p2);
//		引数が1つのコンストラクタを使用
		System.out.println("p3の座標は(" + p3.x + "," + p3.y + ")です");
	}

}

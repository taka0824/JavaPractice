class Point2 {
	int x;
	int y;
}
public class PointInstanceExample02 {
	public static void main(String[] args) {
		Point2 p1 = new Point2();
//		変数にインスタンスの代入しているのではなく、変数がインスタンスの所在地を表している
		Point2 p2 = new Point2();
		Point2 p3 = p2;
		
		p1.x = 0;
		p1.y = 0;
		p2.x = 5;
		p2.y = 10;
		
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")");
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")");
		System.out.println("p3の座標は(" + p3.x + "," + p3.y + ")");
		
		p3.x = 99;
		p3.y = 99;
		
		System.out.println("------------------");
		
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")");
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")");
		System.out.println("p3の座標は(" + p3.x + "," + p3.y + ")");
	}

}

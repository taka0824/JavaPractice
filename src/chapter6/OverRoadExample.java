package chapter6;

public class OverRoadExample {
	public static void main(String[] args) {
		Point p1 = new Point();
//		参照値を代入
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")です");
		System.out.println("=================================");
		p1.set(10,0);
//		引数が(int x, int y)のメソッドを使用
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")です");
		System.out.println("=================================");
		Point p2 = new Point();
		p2.set(p1);
//		引数がPoint pのメソッドを使用（メソッド名が同じだが引数が異なるのでオーバーロード可能）
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")です");
	}

}

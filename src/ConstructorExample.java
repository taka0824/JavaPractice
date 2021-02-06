class Point9 {
	int x;
	int y;
	
	Point9(int x, int y){
		System.out.println("Point9のコンストラクタが呼び出されました");
		this.x = x;
		this.y = y;
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Point9 p = new Point9(5, 10);
		System.out.println("pの座標は(" + p.x + "," + p.y + ")です");
	}
}

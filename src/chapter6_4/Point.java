package chapter6_4;

public class Point {
	int x;
	int y;
	static int counter = 0;
	
	Point(int x, int y){
		System.out.println("Pointクラスのコンストラクタが呼び出されました");
		this.x = x;
		this.y = y;
		Point.counter += 1;
	}

}

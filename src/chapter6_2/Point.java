package chapter6_2;

public class Point {
	int x;
	int y;

	Point(){
		System.out.println("引数のないコンストラクタが実行されました");
		this.x = 0;
		this.y = 0;
	}

	Point(Point p){
		System.out.println("引数が1つのコンストラクタが実行されました");
		this.x = p.x;
		this.y = p.y;
	}

	Point(int x, int y){
		System.out.println("引数が2つのコンストラクタが実行されました");
		this.x = x;
		this.y = y;
	}

}

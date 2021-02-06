class Point8 {
	int x;
	int y;
	
	void multiply(int n) {
		this.x *= n;
		this.y *= n;
	}
	
	boolean isSamePosition(Point8 p) {
		if(this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}
public class ArgumentExample2 {
	public static void main(String[] args) {
		
		Point8 p1 = new Point8();
		p1.x = 2;
		p1.y = 4;
		
		Point8 p2 = new Point8();
		p2.x = 4;
		p2.y = 8;
		
		if(p1.isSamePosition(p2) == true) {
			System.out.println("p1とp2は同じ座標です");
		} else {
			System.out.println("p1とp2は異なる座標です");
//			この段階ではp1p2それぞれ異なる座標を持っているのでelseを通る
		}
		
		p1.multiply(2);
//		p1のxとy軸にmultiplyメソッドを使ってそれぞれ２をかけることで、p2の軸と同じ値になる
		
		if(p1.isSamePosition(p2) == true) {
			System.out.println("p1とp2は同じ座標です");
//			p1の座標が2倍されたことによって、isSamePositionの返り値がtrueになる
		} else {
			System.out.println("p1とp2は異なる座標です");
		}
	}
}

class Point7{
	int x;
	int y;
	
	int getXY() {
		return this.x * this.y;
	}
}

public class ReturnExample {
	public static void main(String[] args) {
		Point7 p = new Point7();
		p.x = 10;
		p.y = 5;
		
		int xy = p.getXY();
		System.out.println("pのxとyをかけた結果は" + xy + "です");
	}
}

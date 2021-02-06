class Point6 {
	int x;
	int y;
	
	void printPosition() {
		System.out.println("座標値は(" + this.x + "," + this.y + ")です");
	}
	
	void multiply(int n) {
		this.x *= n;
		this.y *= n;
	}
	
	void add(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
}

public class ArgumentExample {
	public static void main(String[] args) {
		Point6 p = new Point6();
		p.x = 5;
		p.y = 10;
		
		p.printPosition();
		p.multiply(5);
		p.add(10,10);
		p.printPosition();
	}
}

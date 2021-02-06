class Point5 {
	int x;
	int y;
	
	void printPosition() {
		System.out.println("座標値は(" + this.x + "," + this.y + ")です");
	}
}

public class PrintPositioin {
	public static void main(String[] args) {
		Point5 p = new Point5();
		p.x = 1;
		p.y = 3;
		p.printPosition();
	}
}


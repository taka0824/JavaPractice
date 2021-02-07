package chapter6;

public class Point {
	int x;
	int y;
	
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void set(Point p) {
		this.x = p.x;
		this.y = p.y;
	}

}

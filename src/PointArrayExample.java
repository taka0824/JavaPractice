class Point3 {
	int x;
	int y;
}

public class PointArrayExample {
	public static void main(String[] args) {
		Point3[] points = new Point3[5];
		for(int i = 0; i < 5; i ++) {
			points[i] = new Point3();
			points[i].x = i;
			points[i].y = i + 1;
		}
		for(int j = 0; j < 5; j ++) {
			System.out.println("points[" + j + "]の座標は(" + points[j].x + "," + points[j].y + ")");
		}
	}
}

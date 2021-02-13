package chapter13_3;

import java.util.ArrayList;

class Point {
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	class Point2{
		int x;
		int y;

		Point2(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}
public class ArrayListExample03 {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
//		ArrayListの箱を作るときに、中に入れられる値のデータ型指定を行う
		pointList.add(new Point(0,0));
		pointList.add(new Point(2,3));
		pointList.add(new Point(5,7));
//		pointList.add(new Point2(7,7));
//		入れ物pointListを作ったときに、中に入る値をPointに指定しているので、他の型は入れられない

		for(int i = 0; i < pointList.size(); i ++) {
//			System.out.println("(" + pointList.get(i).x + "," + pointList.get(i).y + ")");
//			中に入っている値は全てPoint型なので、getで取り出すときにキャストが不要
			Point p = pointList.get(i);
			System.out.println("(" + p.x + "," + p.y + ")");
		}
	}
}

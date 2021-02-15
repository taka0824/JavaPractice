package chapter13_12;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point>{
//	インターフェースcomparableは比較を行うためのもの
//	比較のものさしとなる抽象メソッドcompareTo()がある。
//	そのため実装するクラスではオーバーロードする必要がある。
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int compareTo(Point p) {
		return (this.x + this.y) - (p.x + p.y);
//		フィールド値（xとy）の和を比較
//		レシーバーの方が値が大きければプラス
//		引数の方が値が大きければマイナスのintを返す
//		compareToの返り値がintの場合、数値の昇順での並び替えとなる
	}
}

public class SortExample {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(1,3));
		pointList.add(new Point(0,2));
		pointList.add(new Point(7,5));
		pointList.add(new Point(5,2));

		Collections.sort(pointList);
//		pointListリストの中身、Pointクラスの値の比較が行われる（このときPointクラスの中で定義したメソッドCompareToをもとに判断が行われる）

		for(Point p: pointList) {
			System.out.println("(" + p.x + "," + p.y + ")" + " -> " + (p.x + p.y));
		}
	}
}

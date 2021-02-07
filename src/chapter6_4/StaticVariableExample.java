package chapter6_4;

public class StaticVariableExample {
	public static void main(String[] args) {
		Point[] points = new Point[5];
//		pointsという変数でPoint型の値が5つ入る配列の入れ物を作る
		System.out.println("Point.counter = " + Point.counter);
		points[0] = new Point(0,5);
//		作った配列の入れ物pointsに、コンストラクタを使用して作成したPoint型のインスタンスの住所を入れる
		System.out.println("Point.counter = " + Point.counter);
//		コンストラクを使用したことで、クラス変数counterがプラス１される
		points[1] = new Point(1,2);
		System.out.println("Point.counter = " + Point.counter);
		points[2] = new Point(1,3);
		System.out.println("Point.counter = " + Point.counter);
	}
}

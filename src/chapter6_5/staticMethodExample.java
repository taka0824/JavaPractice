package chapter6_5;

public class staticMethodExample {
	public static void main(String[] args) {
		double base = 7.8;
		double height = 4.4;
		System.out.println("底辺が" + base + "高さが" + height + "の三角形の面積は" + simpleCalc.triangleArea(base, height) + "です");
//		クラス名.クラスメソッド名()で呼び出すことができる
	}
}

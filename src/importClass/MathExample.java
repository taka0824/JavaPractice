package importClass;

public class MathExample {
	public static void main(String[] args) {
		System.out.println("引数の絶対値を出力するMathクラスメソッドabs(int/double)");
		System.out.println("-5の絶対値は" + Math.abs(-5));
		System.out.println("5.5の絶対値は" + Math.abs(5.5));
		System.out.println("=====================================");
		System.out.println("引数の平方根を出力するMathクラスのメソッドsqrt(int/double)");
		System.out.println("3.0の平方根は" + Math.sqrt(3.0));
		System.out.println("3の平方根は" + Math.sqrt(3));
		System.out.println("=====================================");
		System.out.println("円周率を持つMathクラスの定数PI");
		System.out.println("半径２の円の面積は" + 2 * 2 * Math.PI);
		System.out.println(Math.PI);
		System.out.println("=====================================");
	}
}

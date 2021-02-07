package Chapter7_3;

public class ColorPoint extends Point {
	String color;

	void printInfo() {
		super.printInfo();
//		スーパークラスのメソッドを呼び出し
		System.out.println("色は" + color + "です");
	}
}

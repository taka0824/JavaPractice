package chapter7_1;

public class InheritanceExample {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint();
//		ColorPointクラスのインスタンスを作成
		cp.x = 5;
		cp.y = 10;
//		Pointクラスに定義されたインスタンス変数
		cp.color = "red";
//		ColorPointクラスに定義されたインスタンス変数
		
		cp.printInfo();
//		Pointクラスに定義されたインスタンスメソッド
	}
}

package mypackage;

public class Test {
//	クラス(インターフェース)に使用できる修飾子はpublicのみ
	public static void main(String[] args) {
//		メソッド・フィールドに使用できる修飾子はpublic/protected/private
		MyClass m = new MyClass();
//		同じパッケージ内のクラスであれば、パッケージの宣言やpublicの宣言なしにクラスやメソッドを使用することができる
//		他のパッケージからアクセスする場合に、パッケージの宣言をしてアクセスしてもクラスがpublicでない場合には使用できないので注意
		m.printMessage();
	}

}

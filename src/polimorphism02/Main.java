package polimorphism02;

public class Main {
	public static void main(String[] args) {
		Person t = new Teacher();
		Person s = new Student();
		
//		子のインスタンスを親の型に入れた時、メソッドは親のクラスで定義されているもののみ実行される
//		子のクラスでオーバーロードされていたメソッドを使用する場合は、子のクラスで定義されたメソッドの内容が実行される
		t.work();
//		t.makeTest();
//		上記のメソッドは変数の型であるPersonクラスで定義されていないので実行できない
		s.work();
	}

}

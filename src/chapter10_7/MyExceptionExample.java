package chapter10_7;

public class MyExceptionExample {
	public static void main(String[] args) {
		int age = -10;
		try {
			if(age < 0) {
				throw new InvalidAgeException("年齢にマイナスの値が挿入されました");
//				InvalidAgeExceptionクラスの中で作成したコンストラクタを使用してメッセージを入れる
//				例外のスロー
			}
			System.out.println("年齢は" + age + "才です");
		}
		catch(InvalidAgeException e) {
//			tryの中で生成された例外をキャッチする
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
	}
}

class InvalidAgeException extends Exception{
//	Exceptionを継承させたクラスの作成（既に存在する例外を継承したオリジナルの例外を作れる）
	InvalidAgeException(String message){
		super(message);
//		Exceptionクラスのコンストラクタを利用して、インスタンス生成時に例外メッセージを持たせる
	}
}

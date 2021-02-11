package exceptionTest;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

public class MyExceptionTest {
	public static void main(String[] args) {
		int age = 1;
		try {
			if(age < 0) {
				throw new InvalidAgeException("不正な年齢のデータが入りました");
			}
			System.out.println("年齢は" + age + "です");
		}
		catch(InvalidAgeException e) {
//			throwされた例外を同じメソッド内でキャッチする
			System.out.println("例外が検出されました");
			System.out.println(e);
		}
	}
}

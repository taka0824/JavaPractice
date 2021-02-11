package chapter10_7;

public class MyExceptionExample {
	public static void main(String[] args) {
		int age = -10;
		try {
			if(age < 0) {
				throw new InvalidAgeException("年齢にマイナスの値が挿入されました");
			}
			System.out.println("年齢は" + age + "才です");
		}
		catch(InvalidAgeException e) {
			System.out.println("例外をキャッチしました");
			System.out.println(e);
		}
	}
}

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

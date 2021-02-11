package chapter10_8;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message){
		super(message);
	}
}

class Person {
	int age;
	void setAge(int age) throws InvalidAgeException {
		if(age < 0) {
			throw new InvalidAgeException("不正な年齢の数値です");
//			throwした例外を同じメソッド内でキャッチしない
		}
		this.age = age;
	}
}

public class ExceptionExample {
	public static void main(String[] args) {
		Person person = new Person();
		try {
			person.setAge(-5);
		}
		catch(InvalidAgeException e) {
//			呼び出し側で例外のスローをキャッチする
			System.out.println("例外が発生しました");
			System.out.println(e);
		}
	}
}

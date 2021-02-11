package exceptionTest;

class InvalidAgeException2 extends Exception{
	InvalidAgeException2(String message){
		super(message);
	}
}

class Person{
	int age;
	void setAge(int age) throws InvalidAgeException2{
//		メソッドの定義の際に例外をなげうるメソッドですよーと忠告
		if(age < 0) {
			throw new InvalidAgeException2("年齢の数値が不正です");
		}
		this.age = age;
		System.out.println("年齢は" + age + "才です");
	}
}

public class Throws {
	public static void main(String[] args) {
		Person person = new Person();
		try{
			person.setAge(-4);
//			例外をなげうるメソッドはtryのなかで呼び出さなければ、例外がthrowされた際にコンパイルエラーとなる
		}
		catch(InvalidAgeException2 e) {
			System.out.println("例外を検出しました");
			System.out.println(e);
		}
	}
}

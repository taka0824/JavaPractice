package chapter7_5;

public class Classes {

}

class Person{
	void work() {
		System.out.println("人です。働きます。");
	}
}

class Teacher extends Person{
	void work() {
		System.out.println("教師です。授業をします。");
	}
	void makeTest() {
		System.out.println("テストを作ります");
	}
}

class Student extends Person {
	void work() {
		System.out.println("生徒です。勉強します。");
	}
}

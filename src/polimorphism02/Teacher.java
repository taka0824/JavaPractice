package polimorphism02;

public class Teacher extends Person {
	void work() {
		System.out.println("教師です。授業をします。");
	}
	
	void makeTest() {
		System.out.println("試験問題を作ります。");
	}
}

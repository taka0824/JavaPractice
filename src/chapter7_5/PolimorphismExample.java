package chapter7_5;

public class PolimorphismExample {
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].work();
		}
		
		((Teacher)persons[2]).makeTest();
//		persons2は初期化する際にStudentのインスタンスを参照しているので、キャストで変数の型をインスタンスの肩にすることが可能
//		変数の型をTeacherにすることで、Teacherクラスのインスタンスメソッドを使用することができる
	}
}

package chapter7_4;

public class InstanceofExample {
	public static void main(String[] args) {
//		Person persons[] = new Person[3];
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Student();
		persons[2] = new Teacher();
		
		for(int i = 0; i < persons.length; i ++) {
			if(persons[i] instanceof Person) {
				System.out.println("persons[" + i + "]" + "はPersonクラスのインスタンスです");
//				StudentとTeacherクラスはPersonクラスを継承しているので、
//				子クラスのStudentとTeacherのインスタンスから行うinstanceofの結果は、親のクラスのPersonもtrueとなる
			}
			if(persons[i] instanceof Student) {
				System.out.println("persons[" + i + "]" + "はStudentクラスのインスタンスです");
			}
			if(persons[i] instanceof Teacher) {
				System.out.println("persons[" + i + "]" + "はTeacherクラスのインスタンスです");
			}
		}
	}

}

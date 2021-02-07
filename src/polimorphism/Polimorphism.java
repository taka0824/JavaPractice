package polimorphism;

public class Polimorphism {
	public static void main(String[] args) {
		Person a = new Student();
//		Person型の変数にStudentのインスタンスを代入することは可能（Personに必要な情報がStudentが全て引き継いでいるため）
//		逆にStudent型の変数にPersonのインスタンスを代入することは不可能（PersonであってもStudentに必要なものを持っているとは限らないため）
		System.out.println(a);
	}

}

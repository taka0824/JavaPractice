package filalModifier;

public class Example {
	public final static double PI = 3.141582653589793;
	public final static int ADULT_AGE = 20;
//	public = クラス外からも参照できる
//	final =  変更不可
	public static void main(String[] args) {
		System.out.println(Example.ADULT_AGE);
		System.out.println(Example.PI);
	}
}


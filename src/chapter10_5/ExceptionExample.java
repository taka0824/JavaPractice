package chapter10_5;

class SimpleClass{
	void doSomething() {
		int[] array = new int[10];
		array[100] = 99;
		System.out.println("doSomethingメソッドを終了します");
	}
}

public class ExceptionExample {
	public static void main(String[] args) {
		SimpleClass obj = new SimpleClass();
		try {
			obj.doSomething();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			e.printStackTrace();
//			例外が発生するまでどのようにメソッドが呼び出されたかのトレースを出力する
		}
	}

}

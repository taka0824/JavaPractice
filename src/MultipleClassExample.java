class SimpleClass{
	String str;
	SimpleClass(String str){
		this.str = str;
	}
}


public class MultipleClassExample {
	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass("Hello");
		System.out.println(sc.str);
	}
}

//プログラムコードに複数のクラスを作成することは可能
//publicをつけられるクラスはファイル名のクラスのみ

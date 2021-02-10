package importClass;

public class StringClass02 {
	public static void main(String[] args) {
		System.out.println("文字列の文字数を返すlength()メソッド");
		String str = "Javaの学習";
		System.out.println(str.length());
		System.out.println("========================");

		System.out.println("引数の文字列が開始するindex番号を返すindexOf(String str)メソッド");
		System.out.println(str.indexOf("学習"));
		System.out.println(str.indexOf("Ruby"));
		System.out.println("引数の文字列を含まない場合は-1を返す");
		System.out.println("========================");

		System.out.println("引数の文字列を含むかどうかbooleanを返すcontains(CharSequence s)メソッド");
		System.out.println("CharSequenceはインターフェースのこと。StringクラスはCharSequenceを実装しているので引数にStringを用いることができる");
		System.out.println(str.contains("Java"));
		System.out.println(str.contains("Ruby"));
		System.out.println("========================");
		
		System.out.println("第一引数の文字列を第二引数の文字列に置換し新しいオブジェクトを生成した結果を返すreplace(CharSequence target, CharSequence replacement)メソッド");
		System.out.println(str.replace("Java", "Java言語"));
		System.out.println(str.replace("Ruby", "PHP"));
		System.out.println("置換が行われなかった場合には、そのままの文字列が返される");
		System.out.println("========================");
		
		System.out.println("引数に指定した正規表現に一致する１で文字列を分割し、分割した結果を文字列の配列で返すsplit(String regex)メソッド");
		String str01 = "2009/11/22";
		String[] items = str01.split("/");
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
}

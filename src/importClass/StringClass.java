package importClass;

public class StringClass {
	public static void main(String[] args) {
		System.out.println("String message = new String('こんにちは')");
		String message = new String("こんにちは");
		System.out.println(message);
		System.out.println("=====================");

		System.out.println("String message1 = new String('こんにちは')");
		String message1 = new String("こんにちは");
		System.out.println(message1);
		System.out.println("=====================");

		System.out.println("message.equals(message1)");
		System.out.println(message.equals(message1));
		System.out.println("文字列が同一であるか比べるためtrue");
		System.out.println("=====================");

		System.out.println("message == message1");
		System.out.println(message == message1);
		System.out.println("参照しているインスタンスが異なるためfalse。たまたま参照先が保持する文字列がこんにちはであっただけ");
		System.out.println("=====================");

		System.out.println("String message = 'こんにちは'");
		String message02 = "こんにちは";
		String message03 = "こんにちは";
		System.out.println("newを使用しない文字列インスタンスの作成方法");
		System.out.println("message02 == message 03");
		System.out.println(message02 == message03);
		System.out.println("同じ文字列をnewを使用しない方法でインスタンスの作成を行う時には、メモリの使用効率向上のため１つのインスタンスで済ませる");

	}
}
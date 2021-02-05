
public class CompareStrings {
	public static void main(String[] args) {
		String a = "aaa";
		String b = "aa";
		
		b = b + "a";
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}

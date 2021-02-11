package privateModifier;

public class ExampleA {
	private String ExPrivate = "Privateアクセスレベル";
	
	public static void main(String[] args) {
		ExampleA insA = new ExampleA();
		System.out.println(insA.ExPrivate);
	}
}
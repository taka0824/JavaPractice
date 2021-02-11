package noModifierExampleA;

public class SubExClassA extends ExClassA {
	public static void main(String[] args) {
		SubExClassA insA = new SubExClassA();
		System.out.println(insA.ExDefault);
//		同一パッケージのnoModifierExampleA内に存在するファイルなので、無指定アクセスレベルにはアクセスできる
	}
}

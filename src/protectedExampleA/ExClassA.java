package protectedExampleA;

import protectedExampleB.ExClassB;

public class ExClassA extends ExClassB {
//インポートしたパッケージ内のクラスの継承が可能になる
//同名のクラスが同じパッケージに存在する場合でも、importしたパッケージから優先してして継承クラスを探しに行く
//どこにも指定した名前のクラスがない場合にはコンパイルエラー

	public static void main(String[] args) {
		System.out.println("========サブクラスのインスタンスからsuperクラスのprotectedフィールドへアクセス可能========");
		ExClassA insA = new ExClassA();
		System.out.println(insA.exProtected);
//		サブクラスを通してスーパークラスのフィールド参照が可能

//		ExClassB insB = new ExClassB();
//		System.out.println(insB.exProtected);

//		protectedの修飾子でサブクラス内でスーパークラスのフィールド・メソッドにアクセスできるようになっている
//		しかし「同一パッケージ内と、そのクラスを継承したサブクラス内から、そのサブクラスへの参照を通してアクセスできる」
//		という考えであるため、スーパークラスのインスタンスを通しての参照は不可
	}
}

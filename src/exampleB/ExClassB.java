package exampleB;

import exampleA.ExClassA;
//同じ階層のexampleAパッケージのアクセス宣言

public class ExClassB {
	public static void main(String[] args) {
		ExClassA insA = new ExClassA();
		System.out.println(insA.exPublic);
//		importしたexampleAパッケージ/ExClassAクラスのメンバ変数exPublicはpublicクラスなので、パッケージ外からでも参照することができる
	}
}

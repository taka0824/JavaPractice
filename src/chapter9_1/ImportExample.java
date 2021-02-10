package chapter9_1;

import java.util.Random;
//import java.util.*;
//クラス名の代わりにアスタリスクでパッケージ内の全てのクラスのインポートが可能になる

public class ImportExample {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt(1000));
//		java.util.Random rand2 = new java.util.Random();
		//importの宣言を行わない場合は、クラス名に加えてjava.utilのパッケージ名も明示する必要がある
//		System.out.println(rand2.nextInt(100));
	}
}

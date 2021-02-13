package chapter13_8;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");

		System.out.println("Iteratorを取得して順番に全要素を取り出す方法");
//		リストにはインデックス番号があるため、for文で順に値を取り出すことができる
//		マップ、セットにはインデックス番号がないため、値を順に取り出すことのできるIteratorを使用する

		Iterator<String> it = set.iterator();
//		ジェネリクスを使用して、中に入る値をStringにする(使用しない場合にはIterator中の値はObject型になる)
//		コレクション(map,list, set)はiteratableインターフェースを持つ
//		iteratableインターフェースが持つメソッドiterator()でイテレータを取得、Iterator型のitにいれる

		while(it.hasNext()) {
//			IterotorインターフェースのメソッドhasNext()
			String str = it.next();
//			Iteratorインターフェースのメソッドnext()
			System.out.println(str);
		}

		System.out.println("==================================");
		System.out.println("Iteratorを取得せずに拡張for文で順番に値を取り出す方法");
//		iteratableインターフェースを実装するコレクション(リスト・マップ・セット)、配列に使用できる拡張for文に使用できる
		for(String str: set) {
			System.out.println(str);
		}
	}
}

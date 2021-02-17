package arrayListMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Cat{
	private String name;

	Cat(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class ListExample {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<Cat>();

		System.out.println("=====空のlist=====");
		System.out.println(cats);
		cats.add(new Cat("ぽんたん"));
		cats.add(new Cat("にゃんたろー"));
		cats.add(new Cat("あび"));
		cats.add(new Cat("ロミ"));
		cats.add(new Cat("ちび"));

		System.out.println("=====値を入れたリストの出力=====");
		System.out.println(cats);
		
		System.out.println("=====indexをfor文で回して順に値を出力する=====");
		for(int i=0; i<cats.size(); i++) {
		    System.out.println(cats.get(i).getName());
		}

		System.out.println("=====indexを拡張for文で回して順に値を出力する=====");
		for(Cat cat: cats) {
			System.out.println(cat.getName());
		}
		
		System.out.println("=====Iteratorとそのメソッド(hasNext()/next())を利用し順番に値を取り出す=====");
		Iterator<Cat> iterator = cats.iterator();
//		list/map/setは皆iterator()メソッドを持つ
		while(iterator.hasNext()) {
			Cat cat = (Cat)iterator.next();
			System.out.println(cat.getName());
//			System.out.println("haxNext()の結果：" + iterator.hasNext());
		}

	}
}

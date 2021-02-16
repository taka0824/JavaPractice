package chapter13_12;

import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point>{
//	インターフェースcomparableは比較を行うためのもの
//	比較のものさしとなる抽象メソッドcompareTo()がある。
//	そのため実装するクラスではオーバーロードする必要がある。
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int compareTo(Point p) {
		return (this.x + this.y) - (p.x + p.y);
//		レシーバーの方が大きいとき⇨プラスが返る
//		（ソートされたときにレシーバーが最初に来る）

//		引数の方が大きいとき⇨マイナスが返る
//		（ソートされたときに引数が最初にくる）
	}
}

class Person implements Comparable<Person> {
	String name;
	int age;


	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person other) {
		return (this.age - other.age);
//		-1をかけることで
//		(1,3)の関係は(-1,-3)
//		(0,4)の関係は(0,-4)
//		(-5,5)の関係は(5,-5)
//		のように逆転する
	}
}

public class SortExample {
	public static void main(String[] args) {
		System.out.println("==========Point compare==========");
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(1,3));
		pointList.add(new Point(0,2));
		pointList.add(new Point(7,5));
		pointList.add(new Point(5,2));

		Collections.sort(pointList);
//		pointListリストの中身、Pointクラスの値の比較が行われる（このときPointクラスの中で定義したメソッドCompareToをもとに判断が行われる）

		for(Point p: pointList) {
			System.out.println("(" + p.x + "," + p.y + ")" + " -> " + (p.x + p.y));
		}
		System.out.println();
		System.out.println("==========Person compare==========");

		ArrayList<Person> personList = new ArrayList<Person>();

		personList.add(new Person("山田", 22));
		personList.add(new Person("鈴木", 30));
		personList.add(new Person("赤坂", 3));
		personList.add(new Person("河本", 77));
		personList.add(new Person("塚田", 16));

		Collections.sort(personList);

		for(Person p: personList) {
			System.out.println("(" + p.name + "," + p.age + ")");
		}
	}
}

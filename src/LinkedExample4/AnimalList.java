package LinkedExample4;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		String[] animals = {"dog", "cat", "fox", "locoon", "squirrel"};
		for(String animal: animals) {
			animalList.add(animal);
		}
		System.out.println(animalList);
		for(String animal: animalList) {
			System.out.println(animal);
		}
		System.out.println();

		System.out.println("===descendingIterator===");
		Iterator al = animalList.descendingIterator();
//		descendingIterator()メソッドで逆順のイテレータを作成
		while(al.hasNext()) {
			System.out.println(al.next());
		}
		System.out.println();

		System.out.println("===descendingIteratorを使用せずに逆順");
		Collections.reverse(animalList);
//		Collectionsクラスのreverse()で引数のリストを逆順にする
		Iterator al2 = animalList.iterator();
//		逆順にしたリストを通常のiterator()メソッドでイテレータを作成する

		System.out.println(al2);
		while(al2.hasNext()) {
			System.out.println(al2.next());
		}
	}

}

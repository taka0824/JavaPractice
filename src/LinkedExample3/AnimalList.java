package LinkedExample3;
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

		System.out.println("Iteratorを使用してhasNext(),next()メソッドで全要素を出力");
		Iterator al = animalList.listIterator(1);
		
		while(al.hasNext()) {
			System.out.println(al.next());
		}
		}
}

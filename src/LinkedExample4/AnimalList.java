package LinkedExample4;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		String[] animals = {"dog", "cat", "fox", "locoon", "squirrel"};
		for(String animal: animals) {
			animalList.add(animal);
		}
		for(String animal: animalList) {
			System.out.println(animal);
		}
		
		System.out.println("===descendingIterator===");
		System.out.println(animalList);
		Iterator al = animalList.descendingIterator();
		while(al.hasNext()) {
			System.out.println(al.next());
		}
	}

}

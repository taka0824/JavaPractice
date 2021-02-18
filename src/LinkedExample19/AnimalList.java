package LinkedExample19;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("cat");
		animalList.add("dog");
		animalList.add("fox");
		animalList.add("lacoon");
		animalList.add("rabbit");
		
		System.out.println("Linked list:" + animalList);
		
		for(String animal: animalList) {
			System.out.println(animal);
		}
	}
}

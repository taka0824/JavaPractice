package LinkedExample11;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("dog");
		animalList.offer("cat");
		animalList.add("fox");
		animalList.offer("bear");
		
		System.out.println(animalList);
		
		for(int i = 0; i < animalList.size(); i++) {
			System.out.println("Element at index" + i + " : " + animalList.get(i));
		}
	}
}

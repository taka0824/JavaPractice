package LinkedExample9;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("dog");
		animalList.offer("cat");
		animalList.add("bear");
		System.out.println(animalList);
		
		LinkedList<String> animalList2 = new LinkedList<>();
		animalList2.add("fox");
		animalList2.offer("fish");
		System.out.println(animalList2);
		
		animalList.addAll(1, animalList2);
		System.out.println(animalList);
	}
}

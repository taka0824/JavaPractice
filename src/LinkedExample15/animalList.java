package LinkedExample15;
import java.util.Collections;
import java.util.LinkedList;

public class animalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("fox");
		animalList.add("elephant");
		animalList.offer("lacoon");
		System.out.println(animalList);
		
		Collections.swap(animalList, 0, 2);
		System.out.println(animalList);
	}

}

package LinkedExample16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AnimalList {
	public static void main(String[] args) {
		List<String> animalList = new LinkedList<>();
		animalList.add("dog");
		animalList.add("cat");
		animalList.add("fox");
		animalList.add("bear");
		System.out.println(animalList);
		
		Collections.shuffle(animalList);
		System.out.println(animalList);
		
	}

}

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
		System.out.println("animalList:" + animalList);
		
		List<String> animalList2 = new LinkedList<>();
		animalList2.add("elephant");
		animalList2.add("frog");
		animalList2.add("fish");
		System.out.println("animalList2:" + animalList2);
		
		animalList.addAll(animalList2);
		System.out.println("animalList-added:" + animalList);
		
		animalList2.set(0, "goldenfish");
		
		System.out.println("animalList-added-set" + animalList);
		System.out.println(animalList2);
	}

}

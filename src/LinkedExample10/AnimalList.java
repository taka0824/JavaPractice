package LinkedExample10;
import java.util.LinkedList;

public class AnimalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		animalList.add("dog");
		animalList.offer("cat");
		animalList.add("fox");
		animalList.offer("bear");
		System.out.println(animalList);
		
		System.out.println("初めの要素:" + animalList.getFirst());
		System.out.println("最後の要素:" + animalList.getLast());
		
		System.out.println("getメソッドで取り出されたものは元のリストから削除されない");
		System.out.println(animalList);
	}
}

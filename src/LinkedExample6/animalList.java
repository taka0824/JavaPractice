package LinkedExample6;
import java.util.LinkedList;

public class animalList {
	public static void main(String[] args) {
		LinkedList<String> animalList = new LinkedList<>();
		String[] animals = {"panda", "bear", "dog", "cat", "fox"};
		for(String animal: animals) {
			animalList.add(animal);
		}
		System.out.println(animalList);

		System.out.println("===リストの両端に効果を与えるDequeメソッド add(First/Last)===");
		System.out.println();

		System.out.println("===addFirst(mouse)===");
		animalList.addFirst("mouse");
		System.out.println(animalList);
		System.out.println();

		System.out.println("===addLast(hamster)===");
		animalList.addLast("hamster");
		System.out.println(animalList);
		System.out.println();

		System.out.println("===リストの両端に効果を与えるDequeメソッド offer(First/Last)===");
//		addと異なりサイズが足りないときには例外ではなく、falseを返す
		System.out.println();

		System.out.println("===offerFirst(squirrel)===");
		animalList.offerFirst("squirrel");
		System.out.println(animalList);
		System.out.println();

		System.out.println("===offerLast(fish)===");
		animalList.offerLast("fish");
		System.out.println(animalList);


	}
}

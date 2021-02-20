package LinkedExample18;
import java.util.LinkedList;

public class colorList {
	public static void main(String[] args) {
		LinkedList<String> colorList = new LinkedList<>();
		colorList.add("red");
		colorList.add("blue");
		colorList.add("black");

		LinkedList<String> newColorList = (LinkedList<String>)colorList.clone();
		System.out.println("originalList" + colorList);
		System.out.println("clonedList" + newColorList);

		colorList.set(0, null);
		System.out.println("originalListEditted" + colorList);
		System.out.println("clonedList" + newColorList);
		System.out.println();

	}
}

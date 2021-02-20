package LinkedExample22;
import java.util.LinkedList;

public class ColorList {
	public static void main(String[] args) {
		LinkedList<String> colorList = new LinkedList<>();
		colorList.add("red");
		colorList.add("blue");
		colorList.add("yellow");
		colorList.add("green");
		System.out.println(colorList);
		
		if(colorList.contains("list")) {
			System.out.println("colorList contains green");
		} else {
			System.out.println("colorList doesn't contains green");
		}
	}
}
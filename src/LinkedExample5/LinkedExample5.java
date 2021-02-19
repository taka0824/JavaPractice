package LinkedExample5;
import java.util.LinkedList;
import java.util.List;

public class LinkedExample5 {
	public static void main(String[] args) {
		List<String> colorList = new LinkedList<>();
		String[] colors = {"black", "white", "red", "blue", "yellow"};

		for(int i = 0; i < colors.length; i++) {
			colorList.add(colors[i]);
		}

		System.out.println("original LinkedList :" + colorList);

		colorList.add(2, "gold");
		colorList.add(6, "silver");

		System.out.println("after added " + colorList);
	}
}

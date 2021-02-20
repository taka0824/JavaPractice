package LinkedExample14;
import java.util.LinkedList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new LinkedList<>();
		colorList.add("red");
		colorList.add("black");
		colorList.add("white");
		System.out.println("colorList:" + colorList);
		
		colorList.clear();
		System.out.println("after clear():" + colorList);
		
	}
}

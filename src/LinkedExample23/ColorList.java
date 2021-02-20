package LinkedExample23;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		LinkedList<String> linkedColorList = new LinkedList<>();
		linkedColorList.offer("red");
		linkedColorList.offer("yellow");
		linkedColorList.offer("black");
		System.out.println("LinkedList:" + linkedColorList);
		List<String> arrayColorList = new ArrayList<String>(linkedColorList);
		System.out.println("arrayColorList:" + arrayColorList);
	}
}

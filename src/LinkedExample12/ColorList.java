package LinkedExample12;
import java.util.LinkedList;

public class ColorList {
	public static void main(String[] args) {
		LinkedList<String> colorList = new LinkedList<>();
		colorList.add("black");
		colorList.add("white");
		colorList.add("blue");
		colorList.add("red");
		colorList.add("green");
		
		System.out.println("original colorList: " + colorList);
		
		System.out.println(colorList.remove(2));
		System.out.println(colorList);
		
		colorList.remove("green");
		System.out.println(colorList);
		
		colorList.add("green");
		System.out.println(colorList);
		
		colorList.removeLast();
		System.out.println("removeLast:" + colorList);
		
		colorList.removeFirst();
		System.out.println("removeFirst:" + colorList);
		
		LinkedList<String> list = new LinkedList<>();
		list.add("white");
		list.offer("red");
		System.out.println("list:" + list);
		
		System.out.println(colorList.remove("white"));
		System.out.println(colorList);
	}
}

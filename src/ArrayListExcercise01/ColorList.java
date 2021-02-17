package ArrayListExcercise01;
import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		colorList.add("black");
		colorList.add("white");
		colorList.add("green");
		colorList.add("red");
		colorList.add("blue");

		System.out.println(colorList);

		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());
		System.out.println(colorList);
		
		System.out.println("===index0にgoldを入れる===");
		colorList.add(0, "gold");
		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());
		System.out.println(colorList);
		
		System.out.println("===index100にsilverを入れる===");
		colorList.add(100, "silver");
		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());
		System.out.println(colorList);
	}

}

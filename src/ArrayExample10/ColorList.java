package ArrayExample10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colors = {"red", "blue", "yellow", "black", "white", "gold", "silver"};

		for(int i = 0; i < colors.length; i++) {
			colorList.add(colors[i]);
		}
		
		System.out.println("===colorList===");
		for(String color: colorList) {
			System.out.println(color);
		}
		
		Collections.reverse(colorList);
		System.out.println("===after reverse()===");
		for(String color: colorList) {
			System.out.println(color);
		}

		Collections.shuffle(colorList);
		System.out.println("===after shuffle()===");
		for(String color: colorList) {
			System.out.println(color);
		}
		
	}

}

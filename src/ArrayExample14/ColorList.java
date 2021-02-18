package ArrayExample14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(int i = 0; i < colors1.length; i++) {
			colorList1.add(colors1[i]);
		}
		System.out.println("===before swap===");
		System.out.println(colorList1);
		
		Collections.swap(colorList1, 0, 3);
		System.out.println("===after swap===");
		System.out.println(colorList1);
	}
}
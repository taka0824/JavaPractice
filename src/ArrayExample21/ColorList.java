package ArrayExample21;

import java.util.ArrayList;

public class ColorList {
	public static void main(String[] args) {
		ArrayList<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println(colorList1);

		String color = "gold";

		colorList1.set(1, color);
		
		System.out.println("index番号1の値を更新");
		System.out.println(colorList1);
	}
}

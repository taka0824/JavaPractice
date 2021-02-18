package ArrayExample12;

import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colors = {"red", "blue", "yellow", "black", "white", "gold", "silver"};

		for(int i = 0; i < colors.length; i++) {
			colorList.add(colors[i]);
		}
		
		for(String color: colorList) {
			System.out.println(color);
		}
		
		System.out.println("===after subList()");
		List<String> subList = colorList.subList(0,3);
		for(String color: subList) {
			System.out.println(color);
		}
		subList.set(0, null);
		
		System.out.println("===subList変更後===");
		for(String color: subList) {
			System.out.println(color);
		}
		
		System.out.println("===元のリストに変更は加えられない===");
		for(String color: colorList) {
			System.out.println(color);
		}
	}
}

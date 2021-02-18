package ArrayExample13;

import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black", "white", "gold", "silver"};
		for(int i = 0; i < colors1.length; i++) {
			colorList1.add(colors1[i]);
		}
		System.out.println("===colorList1===");
		for(String color: colorList1) {
			System.out.println(color);
		}

		List<String> colorList2 = new ArrayList<>();
		String[] colors2 = {"white", "red", "black"};
		for(int i = 0; i < colors2.length; i++) {
			colorList2.add(colors2[i]);
		}
		System.out.println("===colorList2===");
		for(String color: colorList2) {
			System.out.println(color);
		}

		List<String> compareList = new ArrayList<>();
		for(String color: colorList1) {
			compareList.add(colorList2.contains(color)? "Yes":"No");
//			colorList1/2をcontains()メソッドで比較
//			colorList1の値を2でも持っていれば、true = "Yes" を結果のリストに格納していく
		}
		System.out.println("===result of compare===");
		System.out.println(compareList);
	}
}

package ArrayExample15;

import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println(colorList1);

		List<String> colorList2 = new ArrayList<>();
		String[] colors2 = {"pink", "light-green", "sky-blue"};
		for(String color: colors2) {
			colorList2.add(color);
		}
		System.out.println(colorList2);
		
//		第一引数にインデックス番号を指定することで、どの位置に入れるかを指定することができる
		colorList1.addAll(0,colorList2);
		System.out.println(colorList1);
	}
}

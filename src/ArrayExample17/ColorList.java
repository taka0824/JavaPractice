package ArrayExample17;

import java.util.ArrayList;
public class ColorList {
	public static void main(String[] args) {

		ArrayList<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println("colorList1：" + colorList1);

		ArrayList<String> colorList1Clone = (ArrayList<String>) colorList1.clone();
		System.out.println("colorList1Clone：" + colorList1Clone);

		ArrayList<String> colorList2 = new ArrayList<>();
		colorList2.add("red");
		colorList2.add("yellow");
		System.out.println();

		System.out.println("colorList1Clone.removeAll(colorList1)の結果");
		colorList1Clone.removeAll(colorList1);
		System.out.println(colorList1Clone);

		System.out.println("colorList1.removeAll(colorList2)の結果");
		colorList1.removeAll(colorList2);
//		引数に私たリストに含まれるものがremove()される
		System.out.println(colorList1);
		System.out.println();

		System.out.println("colorList1.isEmpty()の結果：" + colorList1.isEmpty());
		System.out.println("colorList1Clone()の結果：" + colorList1Clone.isEmpty());
	}
}

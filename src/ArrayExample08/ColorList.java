package ArrayExample08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colors = {"red", "black", "white", "blue", "green"};

		for(int i = 0; i < colors.length; i++) {
			colorList.add(colors[i]);
		}

		for(String color: colorList) {
			System.out.println(color);
		}

		System.out.println("===Collectionsクラスのsort()メソッドでソート===");
//		String型の場合は辞書順に並べ替えられる
		Collections.sort(colorList);

		for(String color: colorList) {
			System.out.println(color);
		}
	}
}

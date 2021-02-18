package ArrayExample09;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		System.out.println("===colorList1===");
		List<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "black", "white", "blue", "green"};
		for(int i = 0; i < colors1.length; i ++) {
			colorList1.add(colors1[i]);
		}
		for(String color: colorList1) {
			System.out.println(color);
		}

		System.out.println();

		System.out.println("===colorList2===");
		List<String> colorList2 = new ArrayList<>();
		String[] colors2 = {"pink", "yellow", "skyblue", "lightgreen", "purewhite"};
		for(int i = 0; i < colors2.length; i ++) {
			colorList2.add(colors2[i]);
		}
		for(String color: colorList2) {
			System.out.println(color);
		}

		System.out.println();

		System.out.println("Collectionsクラスのcopy()メソッド");
		Collections.copy(colorList1, colorList2);
//		第一引数のListを第二引数のListの要素に変える
//		第一引数のList（上書きされる方）の方が要素が多い場合⇨第二引数に存在しないindex番号の値はそのまま残る
//		第二引数のList（上書きする方）の方が要素が多い場合⇨ArrayListの箱に収まり切らないため、outofboundsExceptionエラーが出る

		System.out.println("===colorList1===");
		for(String color: colorList1) {
			System.out.println(color);
		}

		System.out.println();

		System.out.println("===colorList2===");
		for(String color: colorList2) {
			System.out.println(color);
		}
		
		colorList2.set(0, "goldenPink");
		
		System.out.println("===colorList1===");
		for(String color: colorList1) {
			System.out.println(color);
		}

		System.out.println();

		System.out.println("===colorList2===");
		for(String color: colorList2) {
			System.out.println(color);
		}
	}

}

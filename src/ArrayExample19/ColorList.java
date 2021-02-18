package ArrayExample19;

import java.util.ArrayList;

public class ColorList {
	public static void main(String[] args) {
		ArrayList<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println("colorList1：" + colorList1);
		colorList1.trimToSize();
//		collectionのサイズは値が増えていくことで一定の間隔で自動的に増やされる
//		余計なサイズで持っている場合は、現在の要素数に合わせたサイズにすることで再割り当ての処理を軽減し速度を高めることができる
		System.out.println(colorList1);

		colorList1.ensureCapacity(0);
//		サイズをあらかじめ設定しておくことで、設定した数値に到達するまで再生成が行われなくなる

	}
}

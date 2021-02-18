package ArrayExample16;

import java.util.ArrayList;
import java.util.List;

public class ColorLIst {
	public static void main(String[] args) {
		ArrayList<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println("colorList1：" + colorList1);

		List<String> colorList2 = (ArrayList<String>)colorList1.clone();
//		clone()メソッドの返り値は全てObject型なので、キャストして使用する必要がある
		System.out.println("colorList2：" + colorList2);
		
		colorList1.set(0, null);
		System.out.println("colorLIst1をset()でindex番号0の値を変更");
		System.out.println("colorList1：" + colorList1);
		System.out.println("colorList2：" + colorList2);
		System.out.println("colorList2は変更の影響を受けない");
	}
}

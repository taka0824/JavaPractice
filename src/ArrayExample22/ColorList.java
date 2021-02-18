package ArrayExample22;

import java.util.ArrayList;

public class ColorList {
	public static void main(String[] args) {
		ArrayList<String> colorList1 = new ArrayList<>();
		String[] colors1 = {"red", "blue", "yellow", "black"};
		for(String color: colors1) {
			colorList1.add(color);
		}
		System.out.println(colorList1);
		
		int listSize = colorList1.size();
		
		for(int index = 0; index < listSize; index++) {
			System.out.println("index number" + index + " : " + colorList1.get(index));
		}
	}
	
}

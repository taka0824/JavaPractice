package ArrayExample07;
import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colors = {"red", "black", "white", "blue", "green"};

		for(int i = 0; i < colors.length; i ++) {
			colorList.add(colors[i]);
		}

		System.out.println("===containsを使用したListに指定した値が含まれるかのジャッジ===");
		String color = "silver";
		if(colorList.contains(color)) {
			System.out.println(color + "はリストに含まれます");
		} else {
			System.out.println(color + "はリストに含まれません");
		}
	}
}

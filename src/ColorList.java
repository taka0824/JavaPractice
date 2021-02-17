import java.util.ArrayList;
import java.util.List;

public class ColorList {
	public static void main(String[] args) {
		List<String> colorList = new ArrayList<String>();
		String[] colors = {"black", "white", "red", "blue", "green"};

		for(int i = 0; i < colors.length; i++) {
			colorList.add(colors[i]);
		}

		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());

		System.out.println("===setを使用して指定したindex番号(0)の要素を変更===");
		colorList.set(0, "gold");
		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());

		System.out.println("===removeを使用して指定したindex番号の要素を削除===");
		colorList.remove(1);
		for(String color: colorList) {
			System.out.println(color);
		}
		System.out.println("要素数：" + colorList.size());
	}

}

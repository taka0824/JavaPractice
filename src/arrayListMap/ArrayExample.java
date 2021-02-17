package arrayListMap;

public class ArrayExample {
	public static void main(String[] args) {
		String[] array = new String[5];
		array[0] = "ぽんたん";
		array[1] = "ニャンたろー";
		array[2] = "あび";
		array[3] = "ロミ";
		array[4] = "ちび";
		
		for(String cat: array) {
			System.out.println(cat);
		}
	}

}

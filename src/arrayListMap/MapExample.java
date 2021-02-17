package arrayListMap;

import java.util.HashMap;
import java.util.Map;

class Dog{
	private String name;
	private int age;

	Dog(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> catMap = new HashMap<>();
//		値を入れて取り出してという作業だけでいいので、アッパークラスのMapの型を使用する
		catMap.put("name", "ぽんたん");
		catMap.put("age", "10");
		catMap.put("kind", "パグ");
		catMap.put("birthday", "1993/08/24");

		for(Map.Entry<String, String> cat: catMap.entrySet()) {
			System.out.println(cat.getKey() + ":" + cat.getValue());
		}
	}
}

package chapter13_6;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("first name", "太郎");
		map.put("last name", "山田");
		map.put("address", "山梨県韮崎市");
		map.put("tel", "888-8888-8888");

		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());

		System.out.println(map.get("first name"));
		System.out.println(map.get("last name"));
		System.out.println(map.get("address"));
		System.out.println(map.get("tel"));
		System.out.println(map.get("phone"));
//		keyが存在しない場合には、nullと出力される
		
		System.out.println("==============================");
		System.out.println("for文でmapの全valueを表示する方法");
	
		for(String value: map.values()) {
			System.out.println(value);
		}
	}

}

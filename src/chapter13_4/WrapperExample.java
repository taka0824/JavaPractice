package chapter13_4;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
//		Integer型を値に持つArrayListを作成する
		
		integerList.add(Integer.valueOf(50));
		integerList.add(Integer.valueOf(100));
//		Integer型の値をintegerListにaddする
		
		Integer integer0 = integerList.get(0);
		Integer integer1 = integerList.get(1);
//		Integer型でintegerListに格納されている値をInteger型の変数で参照
		
		int i1 = integer0.intValue();
		int i2 = integer1.intValue();
//		IntegerのメソッドintValueを使用して、レシーバーの参照型Integerをプリマティブ型intに変換する
		
		System.out.println(i1);
		System.out.println(i2);


	}
}

package chapter13_5;

import java.util.ArrayList;

public class BoxingExample {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();

		integerList.add(10);
		integerList.add(500);
//		intからIntegerへの変換(Integer.valueOf(int))不要
//		ラッパークラスへの格納、オートボクシングが機能（intをそのままIntegerクラスに入れること）
//		ラッパークラスからの取り出し、オートアンボクシング機能（取り出したIntegerクラスをintクラスとして使用すること）

		int i0 = integerList.get(0);
		int i1 = integerList.get(1);
//		Integer型のArrayListから取り出しているので、取り出したデータの形はIntegerだが、
//		オートアンボクシング機能で取り出してそのまま(Integer.intValue()不要で)、int型で使用することができる

		System.out.println(i0);
		System.out.println(i1);
		
		System.out.println("index番号で値を取り出す");
		System.out.println(integerList.get(0));
	}
}
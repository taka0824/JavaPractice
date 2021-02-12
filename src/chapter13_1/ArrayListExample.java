package chapter13_1;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList months = new ArrayList();
		months.add("January");
		System.out.println("monthsの要素数：" + months.size());
		
		months.add("February");
		System.out.println("monthsの要素数：" + months.size());
		
		months.add("March");
		System.out.println("monthsの要素数：" + months.size());
		
		System.out.println(months.get(0));
		System.out.println(months.get(1));
		System.out.println(months.get(2));
		System.out.println(months.get(3));
	}
}

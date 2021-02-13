package chapter13_7;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		System.out.println(set.add("Janny"));
		System.out.println(set.add("Feb"));
		System.out.println(set.add("Feb"));
		System.out.println(set.add("Mar"));
		System.out.println(set.add("Apr"));
		
		System.out.println(set);
//		追加した順番と異なる形で、配列形式で表示される
		
		System.out.println(set.contains("Jan"));
		System.out.println(set.contains("Janny"));
//		Setのなかにcontainsの引数と等しい値があればtrueが返る
		System.out.println(set.contains("May"));
	}

}

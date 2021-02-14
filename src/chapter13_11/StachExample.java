package chapter13_11;

import java.util.LinkedList;

public class StachExample {
	public static void main(String[] args) {
		LinkedList<String> stack = new LinkedList<String>();
		stack.addLast("(1)");
		System.out.println("スタックの状態：" + stack);
		stack.offer("(2)");
		System.out.println("スタックの状態：" + stack);
		stack.addLast("(3)");
		System.out.println("スタックの状態：" + stack);
		stack.offer("(4)");
		System.out.println("スタックの状態：" + stack);	
//		addLastもofferもQueueインターフェースの末尾に値を入れるメソッド
		System.out.println("============================");
		while(!stack.isEmpty()) {
			System.out.println("要素の取り出し：" + stack.removeLast());
//			pollメソッドと異なり、末尾から値を取り出す
			System.out.println("スタックの状態：" + stack);
		}
	}
}

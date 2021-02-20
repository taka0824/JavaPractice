package LinkedExample19;
import java.util.Deque;
import java.util.LinkedList;

public class ColorList {
	public static void main(String[] args) {
		Deque<String> colorList = new LinkedList<>();
//		Dequeインターフェースの変数もしくはDequeインターフェースを実装するLinkedListで使用できるメソッド（poll/peek）
		colorList.offer("red");
		colorList.offer("blue");
		colorList.offer("black");
		colorList.add("white");
		colorList.offer("gold");
		System.out.println(colorList);

		System.out.println("polled element:" + colorList.poll());
		System.out.println("after poll:" + colorList);

		System.out.println("peaked element(first):" + colorList.peek());
		System.out.println("after peek:" + colorList);

		System.out.println("peaked element(last)" + colorList.peekLast());
		System.out.println("after peek:" + colorList);

	}
}

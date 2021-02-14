package chapter13_10;

import java.util.LinkedList;
import java.util.Queue;

class Point {
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Test {

}

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
//		LinkedListはQueueインターフェイスを実装しているので、Queueクラス変数に割り当てることができる（queueの入れ物）
		queue.offer("(1)");
		System.out.println("キューの状態：" + queue);
		queue.offer("(2)");
		System.out.println("キューの状態：" + queue);
		queue.offer("(3)");
		System.out.println("キューの状態：" + queue);
		queue.offer("(4)");
		System.out.println("キューの状態：" + queue);

		while(! queue.isEmpty()) {
			System.out.println("キューの取り出し：" + queue.poll());
			System.out.println("キューの状態：" + queue);
		}
	}
}

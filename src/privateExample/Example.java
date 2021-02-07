package privateExample;

public class Example {
	private int speed;
//	privateは同じクラス内でのみ参照可能

	void speedUp() {
		if(speed < 80) {
			speed ++;
		}
	}

	void speedDown() {
		if(speed > 0) {
			speed --;
		}
	}
}

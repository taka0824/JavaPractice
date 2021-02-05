
public class SwitchExample {
	public static void main(String[] args) {
		int score = 0;
		
		switch(score) {
		case 5:
			System.out.println("大変良くできました");
			break;
		case 4:
			System.out.println("良くできました");
			break;
		case 3:
			System.out.println("合格です");
			break;
		case 2:
			System.out.println("もう少しがんばりましょう");
			break;
		case 1:
			System.out.println("がんばりましょう");
			break;	
		default:
			System.out.println("正しい数値を入力してください");
		}
	}
}

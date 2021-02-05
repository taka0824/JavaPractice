
public class ElseExample02 {
	public static void main(String[] args) {
		int age;
		age = 13;
		
		if(age < 7) {
			System.out.println("入場料は無料です");
		} else if(age < 12){
			System.out.println("子供料金です");
		} else {
			System.out.println("大人料金です");
		}
	}
}

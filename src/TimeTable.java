
public class TimeTable {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i ++) {
			for(int j = 1; j <= 9; j++) {
				int value = i * j;
				System.out.print(i + "x" + j + "=" + value);
				System.out.print("  ");
			}
			System.out.println("");
		}
	}
}

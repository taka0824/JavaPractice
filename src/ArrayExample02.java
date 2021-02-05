
public class ArrayExample02 {
	public static void main(String[] args) {
		int[] scores = {50, 55, 80, 75, 65};
		int n = scores.length;
		
		for(int i = 0; i < n; i++) {
			//配列のインデックスは0スタートなので初期値は0にセット
			System.out.println(scores[i]);
		}
	}
}


public class ArrayExample03 {
	public static void main(String[] args) {
		int[][] scores = {{50,55,60,55,75},
				{65,85,90,95,88},
				{30,15,25,55,60}

		};

		int l = scores.length;
//		l = 配列の中の要素の数
		int m = scores[1].length;
//		m = 配列の中の配列(scores[1])の中の要素の数
		for(int i = 0; i < l; i++) {
			System.out.print((i + 1) + "学期のスコア:");
			for(int j = 0; j < m; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println("");
		}
	}
}

class Point4 {
	int x;
	int y;
}

public class NullExample {
	public static void main(String[] args) {
		Point4[] points = new Point4[5];
//		ポイント型の値が５つ入れられる配列を作る（中身は空）
		
		for(int i = 0; i < 3; i++) {
			points[i] = new Point4();
//			からの配列にポイント型のインスタンスの住所を入れる
			points[i].x = i;
			points[i].y = i + 2;
//			インスタンスフィールドを入れる
		}
		
		for(int j = 0; j < 5; j++) {
			if(points[j] == null) {
				System.out.println("points[" + j + "]" + "は参照がありません");
			} else {
				System.out.println("points[" + j + "]" + "の座標は(" + points[j].x + "," + points[j].y + ")" );
			}
		}
	}
}

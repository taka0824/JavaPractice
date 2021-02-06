
public class List5_13 {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		incArray(array);
		
		for(int i: array) {
			System.out.println(i);
//			プリマティブ値をメソッドの引数に使用した場合は値をコピーしたものが引数にわたっている（Aをコピーして引数にAコピーバージョンが渡る）
//			参照値をメソッドの引数に渡した場合は住所をコピーしたものが引数に渡される（住所をコピー。コピーした住所先で参照するものは同じ。）
//			⇨結果として参照する値は同じものを参照するので、メソッドの中で書き換えた内容はメソッド外でも変更が反映される
		}
	}
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
}

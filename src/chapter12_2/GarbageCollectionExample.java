package chapter12_2;

class DataSet{
	double[] d  = new double[100000];
}

public class GarbageCollectionExample {
	public static void main(String[] args) {
		DataSet[] data = new DataSet[1000];
		for(int i = 0; i < 1000; i++) {
			data[i] = new DataSet();
//			１７２回目のインスタンス生成時にガベージコレクションが行われる
			data[i] = null;
			System.out.println("生成済のインスタンス数：" + (i + 1));
			System.out.println("空きメモリサイズ：" + Runtime.getRuntime().freeMemory());
			if(i % 100 == 0) {
				Runtime.getRuntime().gc();
				System.out.println("**********ガベージコレクションが実行されました**********");
			}
		}
	}

}

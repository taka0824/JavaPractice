package customer;

public class CustomerManager {
	public static void main(String[] args) {
		CustomerCard[] cards = new CustomerCard[100];

		cards[0] = new ShoeShopCustomerCard("山田太郎","東京都",26.5);
		cards[1] = new ShoeShopCustomerCard("佐藤花子", "神奈川県", 24.5);
		cards[2] = new ShoeShopCustomerCard("鈴木健二", "茨城県", 26.0);
		cards[3] = new HatShopCustomerCard("津田雅夫", "山梨県", 57.0);
		cards[4] = new HatShopCustomerCard("仲間由紀恵", "沖縄県", 62.3);
		cards[5] = new ShoeShopCustomerCard("浜辺美波", "石川県", 22.5);

		for(int i = 0; i < 100; i++) {
			if(cards[i] == null) {
				break;
			}
			System.out.println(i + 1 + "番目の顧客カードに記載の情報");
			cards[i].printInfo();
//			for文で回されるメソッドは同じに見えるが、それぞれの値の参照値によってクラス毎のメソッド内容が変わる
//			なぜ？
//			⇨printInfo()メソッドはポリモーフィズムの特性により、変数が参照しているインスタンスのクラスのメソッドを使用しているため
//			0~2の値がShoeShopCustomerCardクラスのインスタンス
//			3~4の値がHatShopCustomerCardクラスのインスタンス
			System.out.println("=============================");
		}
	}

}

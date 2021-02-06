class CustomerCard {
	int id;
	String name;
	String address;
	double shoeSize;
	
	CustomerCard(int id, String name, String address, double shoeSize){
		this.id = id;
		this.name = name;
		this.address = address;
		this.shoeSize = shoeSize;
	}
	
	void printInfo() {
		System.out.println("ID：" + this.id);
		System.out.println("氏名：" + this.name);
		System.out.println("住所：" + this.address);
		System.out.println("靴のサイズ：" + this.shoeSize);
	}
}
public class CustomerManager {
	public static void main(String[] args) {
		CustomerCard[] cards = new CustomerCard[100];
		
		cards[0] = new CustomerCard(1001,"山田太郎","東京都",26.5);
		cards[1] = new CustomerCard(1002, "佐藤花子", "神奈川県", 24.5);		
		cards[2] = new CustomerCard(1003, "鈴木健二", "茨城県", 26.0);
		cards[3] = new CustomerCard(1004, "津田雅夫", "山梨県", 25.5);
		
		for(int i = 0; i < 100; i++) {
			if(cards[i] == null) {
				break;
			}
			System.out.println(i + 1 + "番目の顧客カードに記載の情報");
			cards[i].printInfo();
			System.out.println("=============================");
		}
	}

}

package customer;

public class ShoeShopCustomerCard extends CustomerCard {
	double shoeSize;
	
	ShoeShopCustomerCard(String name){
		super(name);
	}

	ShoeShopCustomerCard(String name, String address, double shoeSize){
		super(name, address);
		this.shoeSize = shoeSize;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("靴のサイズ：" + shoeSize);
	}
}
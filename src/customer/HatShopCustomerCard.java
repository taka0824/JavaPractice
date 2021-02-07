package customer;

public class HatShopCustomerCard extends CustomerCard {
	double hatSize;

	HatShopCustomerCard(String name){
		super(name);
	}

	HatShopCustomerCard(String name,String address,double hatSize){
		super(name, address);
		this.hatSize = hatSize;
	}
	
	void printInfo() {
		super.printInfo();
		System.out.println("帽子のサイズ：" + hatSize);
	}
}

package customer;

public class CustomerCard {
	static int nextId = 1001;
	int id;
	String name;
	String address;

	CustomerCard(String name, String address){
		id = nextId;
		nextId += 1;
		this.name = name;
		this.address = address;
	}
	CustomerCard(String name){
		this(name, "");
	}

	void printInfo() {
		System.out.println("ID：" + id);
		System.out.println("名前：" + name);
		System.out.println("住所：" + address);
	}
}
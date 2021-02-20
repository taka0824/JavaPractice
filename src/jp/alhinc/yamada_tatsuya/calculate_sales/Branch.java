package jp.alhinc.yamada_tatsuya.calculate_sales;

public class Branch {
	public static int branchNumber = 000;
	private int code = 000;
	private String name;
	private int totalPrice;
	
	Branch(String name, int totalPrice){
		Branch.branchNumber += 1;
		this.code = Branch.branchNumber;
		this.name = name;
		this.totalPrice = totalPrice;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}

}

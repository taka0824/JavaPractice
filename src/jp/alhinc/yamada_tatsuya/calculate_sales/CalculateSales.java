package jp.alhinc.yamada_tatsuya.calculate_sales;

import java.util.ArrayList;
import java.util.List;

public class CalculateSales {
	public static void main(String[] args) {
		List<Branch> branchList = new ArrayList<>();
		branchList.add(new Branch("aeon", 9800));
		branchList.add(new Branch("vallo", 15000));
		branchList.add(new Branch("fressa", 10800));
		
		for(Branch branch: branchList) {
			System.out.println(branch.getCode() + "," + branch.getName() + "," + branch.getTotalPrice());
		}
	}

}

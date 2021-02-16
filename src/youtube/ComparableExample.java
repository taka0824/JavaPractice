package youtube;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
	private int registrationNumber;
	private String name;
	private int price;

	Car(int r,String name, int p){
		this.registrationNumber = r;
		this.name = name;
		this.price = p;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int compareTo(Car other) {
		return this.price - other.price;
	}

//	public int compareTo(Car other) {
//		return name.length() - other.name.length();
//	}
}

public class ComparableExample {
	public static void main(String[] args) {
		System.out.println("=====before sort=====");
		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Car(1,"ベンツ",500));
		carList.add(new Car(2,"アルテッツァ",800));
		carList.add(new Car(3,"コンテ",200));
		carList.add(new Car(4,"アルトワークス",1000));
		carList.add(new Car(5,"フォルクスワーゲン",300));

		for(Car car: carList) {
			System.out.println("(" + car.getRegistrationNumber() + "," + car.getName() + "," + car.getPrice() + ")");
		}

		System.out.println("=====sort with Comparable=====");

		Collections.sort(carList);
		for(Car car: carList) {
			System.out.println("(" + car.getRegistrationNumber() + "," + car.getName() + "," + car.getPrice() + ")");
		}
	}

}

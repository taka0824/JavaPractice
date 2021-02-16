package youtube;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
	private int registrationNumber;
	private int price;

	Car(int r, int p){
		this.registrationNumber = r;
		this.price = p;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public int getPrice() {
		return price;
	}

	public int compareTo(Car other) {
		return this.price - other.price;
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		System.out.println("=====before sort=====");
		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Car(1,500));
		carList.add(new Car(2,800));
		carList.add(new Car(3,200));
		carList.add(new Car(4,1000));
		carList.add(new Car(5,300));

		for(Car car: carList) {
			System.out.println("(" + car.getRegistrationNumber() + "," + car.getPrice() + ")");
		}

		System.out.println("=====sort with Comparable=====");

		Collections.sort(carList);
		for(Car car: carList) {
			System.out.println("(" + car.getRegistrationNumber() + "," + car.getPrice() + ")");
		}
	}

}

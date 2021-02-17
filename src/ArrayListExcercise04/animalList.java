package ArrayListExcercise04;

import java.util.ArrayList;
import java.util.List;

class Animal{
	private String name;

	Animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class animalList {
	public static void main(String[] args) {
		
		List<Animal> animalList = new ArrayList<>();
		
		for(int i = 1; i < 6; i++) {
			animalList.add(new Animal("animal" + i));
		}
		
		System.out.println("ArrayListの値を全て出力");
		for(int i = 0; i < animalList.size(); i++) {
			System.out.println(animalList.get(i).getName());
		}
		
		System.out.println("index番号3の値をgetメソッドで取得");
		System.out.println(animalList.get(3).getName());
		
		System.out.println("存在しないindex番号100の値をgetメソッドで取得");
		System.out.println(animalList.get(100).getName());
	}

}

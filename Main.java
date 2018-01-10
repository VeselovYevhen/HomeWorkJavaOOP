package com.gmail.veselov;

public class Main {

	public static void main(String[] args) {
		
		Cat catOne = new Cat ("Petro", "White", "Maine Coon", 2.5);
		Cat catTwo = new Cat ("Vasya", "Black", "Persian", 4.5);
		
		System.out.println("First cat");
		catOne.mrrr();
		System.out.println(catOne);
		System.out.println();
		System.out.println("Second cat");
		catTwo.mrrr();
		System.out.println(catTwo);		

	}

}

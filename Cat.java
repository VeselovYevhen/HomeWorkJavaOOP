package com.gmail.veselov;

public class Cat {
	
	private String name;
	private String color;
	private String breed;
	private double age;
		
	public Cat(String name, String color, String breed, double age) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public void mrrr() {
		System.out.println("Mrrr mrrr ...");
	}

	@Override
	public String toString() {
		return "Cat [name = " + name + ", color = " + color + ", breed = " + breed + ", age = " + age + "]";
	}
	
	

}

//learning how polymorphism works in java

/*
	As you can see, Parent class can use to contain any child class
	but can't call it's method ...
	
	To call the method you have to type case it to the suitable class.
*/

import java.io.*;

public class PolyAnimal{
	public static void main(String[] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			Animal a = new Dog();
			
			Dog d = (Dog) a;
			
			d.setAge(24);
			d.setWeight(22.5f);
			d.setColor("white");
			
			System.out.println(d.getColor());
			
		}catch(Exception ex){
			System.out.println("OOps there is some sort of exception... ");
		}
	}
}

class Animal{
	protected float weight;
	protected int age;
	
	public void setWeight(float weight){
		this.weight = weight;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public float getWeight(){
		return this.weight;
	}
	
	public int getAge(){
		return this.age;
	}
}

class Dog extends Animal{
	private String color;
	
	private String name;
	
	public void setColor(String color){
		this.color = color;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getColor(){
		return this.color;
	}
	
}
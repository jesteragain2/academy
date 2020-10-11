package by.academy.classwork.lesson1;

public class Aplication {
	public static void main(String[] args) {
		
		Cat boris=new Cat();
		Cat nick=new Cat("Nick");
		
		nick.eat();
		nick.sleep();
		nick.walk();
		
		boris.grow();
		System.out.println("Возраст кота "+boris.nickname+" (в годах): "+boris.age);
		boris.grow();
		System.out.println("Возраст кота "+boris.nickname+" (в годах): "+boris.age);
		boris.grow();
		System.out.println("Возраст кота "+boris.nickname+" (в годах): "+boris.age);
		
	}
}

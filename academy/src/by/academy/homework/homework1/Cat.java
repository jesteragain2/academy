package by.academy.homework.homework1;

public class Cat {
	
	int age;
	String nickname="безимянный";
	
	public void grow() {
		this.age=age+1;
	}
	
	public void sleep() {
		System.out.println("Кот "+nickname+" спит.");
	}
	
	public void eat() {
		System.out.println("Кот "+nickname+" ест.");
	}
	
	public void walk() {
		System.out.println("Кот "+nickname+" гуляет.");
	}
	
	public Cat() {
		System.out.println("Кот создан.");
	}
	
	public Cat(String nickname) {
		this.nickname=nickname;
		System.out.println("Кот "+nickname+" создан.");
	}
	
}

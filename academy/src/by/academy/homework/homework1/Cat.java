package by.academy.homework.homework1;

public class Cat {
	
	int age;
	String nickname="безимянный";
	double money;
	char initials;
	boolean isHomeAnimal;
	
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
	
	public void setMoney(double money) {
		this.money=money;
	}
	
	public double getMoney() {
		return money;
	}
	
	public void setInitials(char initials) {
		this.initials=initials;
	}
	
	public char getInitials() {
		return initials;
	}
	
	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal=isHomeAnimal;
	}
	
	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}
	
}

package by.academy.homework.homework1;

public class Application {
	public static void main(String ...args){
		
		Cat cat1=new Cat();
		Cat bor=new Cat("Boris");
		
		bor.eat();
		bor.sleep();
		bor.walk();
		
		cat1.grow();
		System.out.println("Возраст кота '"+cat1.nickname+"' (в годах): "+cat1.age);
		cat1.grow();
		System.out.println("Возраст кота '"+cat1.nickname+"' (в годах): "+cat1.age);
		cat1.grow();
		System.out.println("Возраст кота '"+cat1.nickname+"' (в годах): "+cat1.age);
		
	}
}

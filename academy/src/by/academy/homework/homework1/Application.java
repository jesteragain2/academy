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
		
		bor.setMoney(13.23);
		System.out.println("У кота с именем "+bor.nickname+" есть "+bor.getMoney()+"$.");		
	
		bor.setInitials('B');
		System.out.println("У кота с именем "+bor.nickname+" первая буква клички "+bor.getInitials()+".");		
		
		bor.setIsHomeAnimal(true);
		bor.getIsHomeAnimal();
		if (bor.isHomeAnimal==true) {
			System.out.println("Кот "+bor.nickname+" домашнее животное.");
		}else {
			System.out.println("Кот "+bor.nickname+" дикое животное.");
		}
		
	}
}
 
package by.academy.classwork.lesson1;

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
			System.out.println("Кот рождён. Кота никак не зовут.");
		}
		
		public Cat (String nickname){
			this.nickname=nickname;
			System.out.println("Кот рождён. Кота зовут "+nickname+".");
		}
		
}

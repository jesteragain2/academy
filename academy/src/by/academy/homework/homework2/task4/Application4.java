package by.academy.homework.homework2.task4;

public class Application4 {

	public static void main(String[] args) {
		
		int i=2;		
		System.out.println(i);
		while (true) {
			i*=2;
			if (i<1000000) {
				System.out.println(i);
			}else {
				break;
			}			
		}
			 
	}
	
}

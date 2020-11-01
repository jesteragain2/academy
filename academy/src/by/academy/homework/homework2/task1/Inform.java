package by.academy.homework.homework2.task1;
import java.util.Scanner;

public class Inform {
	
	double check,finaleCheck;
	int old;
	
	public void setInformation() {			
		
		Scanner input=new Scanner(System.in);		
		
		System.out.println("Введите сумму чека.");
		this.check=input.nextDouble();
		System.out.println("Введите возраст покупателя.");
		this.old=input.nextInt();
	}
	
	public void finaleCheck() {		
		
		if(check<100) {
			this.finaleCheck=check*0.95;
		}else if(check>=100&check<200) {
			this.finaleCheck=check*0.93;
		}else if(check>=200&check<300) {
			
			if (old>18) {
				this.finaleCheck=check*0.84;
			}else {
				this.finaleCheck=check*0.91;
			}
				
		}else if(check>=300&check<400) {
			this.finaleCheck=check*0.85;
		}else {
			this.finaleCheck=check*0.8;
		}
		
		System.out.printf("%.2f",finaleCheck);
		
	}
}

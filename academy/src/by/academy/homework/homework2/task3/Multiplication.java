package by.academy.homework.homework2.task3;
import java.util.Scanner;

public class Multiplication {
	
	int num, finaleNum;
	
	public void multiply(){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Введите число от 1 до 10");
		this.num=input.nextInt();input.close();
		if (num<1||num>10) {
			System.out.println("Введены неверные данные.");
		}else {
			for(int i=1;i<=10;i++) {
				finaleNum=i*num;
				System.out.println(num+"*"+i+"="+finaleNum);
			}
		}
	}
}

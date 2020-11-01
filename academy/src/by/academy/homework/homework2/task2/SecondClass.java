package by.academy.homework.homework2.task2;
import java.io.IOException;
import java.util.Scanner;

public class SecondClass {

	String tipe,numS;
	int num, numCnum;
	double numD;
	float numF;
	char numC;
	
	public void cases() throws IOException {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Введите тип переменной.");
		this.tipe=input.nextLine().toLowerCase();
		
		switch (tipe){
			
			case "int":
				System.out.println("Введите значение переменной.");
				this.num=input.nextInt();
				this.num=num%2;
				System.out.println(num);break;
			case "double":
				System.out.println("Введите значение переменной.");
				this.numD=input.nextDouble();
				this.numD=numD*0.7;
				System.out.println(numD);break;
			case "float":
				System.out.println("Введите значение переменной.");
				this.numF=input.nextFloat();
				this.numF=(float)Math.pow(numF,2);
				System.out.println(numF);break;
			case "char":
				System.out.println("Введите значение переменной.");
				this.numC=(char)System.in.read();
				numCnum=(int)numC;
				System.out.println(numCnum);break;
			case "string":
				System.out.println("Введите значение переменной.");
				this.numS=input.nextLine();
				System.out.println("Hello "+numS);break;
			default:
				System.out.println("Unsuported type.");break;
		}
		
	}
	
}

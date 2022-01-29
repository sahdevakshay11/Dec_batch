package pkg1;

import java.util.Scanner;

public class Factorial {
	
	public void method1(){
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number");
		int number=s.nextInt();
		int fact=1;
		for(int i=1;i<=number;i++){
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+number+" is = "+fact);
	}
	
	public static void main(String[] args) {
		
		Factorial obj=new Factorial();
		obj.method1();
	}

}

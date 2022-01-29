package pkg1;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		
		
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of A");
		int a=s.nextInt();
		System.out.println("enter values of B");
		int b=s.nextInt();
		
		System.out.println("Before Swap of number");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		System.out.println();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap of numbers without using 3rd variable ");
        System.out.println("A= "+a);
        System.out.println("B= "+b);
	}
}

package pkg1;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		
		
		int temp;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a");
		int a=s.nextInt();
//		System.out.println("value of a before"+a);
		System.out.println("enter value of b");
	    int b=s.nextInt();
	    System.out.println();
	    System.out.println("Before Swapping of Numbers");
		System.out.println(" A=  "+a);
		System.out.println(" B=  "+b);
		System.out.println();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping using 3rd Variable");
		System.out.println(" A= "+a);
		System.out.println(" B= "+b);
	}
}

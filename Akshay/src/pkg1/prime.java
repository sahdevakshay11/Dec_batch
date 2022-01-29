package pkg1;

import java.util.Scanner;

public class prime {
	
	
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("please enter a number ");
	int num=s.nextInt();
	int half=num/2;
	int flag=0;
	
	
		for(int i=2;i<half;i++){
			
			if(num%i==0){
				System.out.println("Not a Prime number");
				flag=1;
				break;
		}
			}
		if(flag==0){
			System.out.println(" prime number");
		}
}
}

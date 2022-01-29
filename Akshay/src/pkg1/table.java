package pkg1;

import java.util.Scanner;

public class table {

	public void method(){
		Scanner s=new Scanner(System.in);
		System.out.println("please enter a number ");
		int number=s.nextInt();
	for(int i=1;i<=10;i++){
		
		int a=i*number;
		System.out.println(number+"x"+i+"="+a);
		
	}
	}
	public static void main(String[] args) {
		table obj=new table();
		obj.method();
	}
}

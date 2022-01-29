package pkg1;

import java.util.Scanner;

public class day5 {
	public int multi(int a,int b) {
	 int c;
	 c=a*b;
	 return c;
	 }
	public int sum(int a,int b) {
		int c;
		c=a+b;
		return c;
	}
	public int sub(int a,int b){
		int c;
		c=a-b;
		return c;
	}
	public int divide(int a,int b){
		int c;
		c=a/b;
		return c;
		
	}
	
	
public static void main(String[] args) {
	day5 obj=new day5();
	Scanner s=new Scanner(System.in);
	System.out.println("enter value of X1 ");
	int X1=s.nextInt();
	System.out.println("enter value of X2 ");
	int X2=s.nextInt();
	System.out.println("enter value of X3 ");
	int X3=s.nextInt();
	System.out.println("enter value of X4 ");
	int X4=s.nextInt();
	System.out.println("enter value of X5 ");
	int X5=s.nextInt();
	System.out.println("enter value of X6 ");
	int X6=s.nextInt();
	int multi1=obj.multi(X1,X2);
	
	int sum1=obj.sum(multi1, X3);
	int sum2=obj.sum(sum1, X4);
	int sub=obj.sub(sum2, X5);
	int divide=obj.divide(sub, X6);
	System.out.println("result of (((((x1*x2)+x3)+x4)-x5)/x6) = "+divide);
	
}
}

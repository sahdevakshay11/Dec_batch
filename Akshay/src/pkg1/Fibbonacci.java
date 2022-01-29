package pkg1;

public class Fibbonacci {
	
	public void method1(){
		
	int a=0;
	int b=1;
	int c;
	
	System.out.print(a+" "+b);
	for(int i=0;i<=12;i++){
		
	c=a+b;
	a=b;
	b=c;
	
	System.out.print(" "+c);
	
	}
	}
	
public static void main(String[] args) {
	
	Fibbonacci obj=new Fibbonacci();
	obj.method1();
}
}

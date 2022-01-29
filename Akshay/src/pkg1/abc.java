package pkg1;
public class abc {
	
public void divide(int a,int b){
	int c;
	c=a/b;
	System.out.println("final result is "+c);
	
}

public int sub(int a,int b){
	int c;
	c=a-b;
	return c;
}

public int sum(int a,int b){
	int c;
	c=a+b;
	return c;
}

public int multi(int a,int b){
	int c;
	c=a*b;
	return c;
}

	public static void main(String[] args) {
	
		abc obj=new abc();
	int mult=obj.multi(10, 2);
	System.out.println("multiple is- "+mult);
	int sum1=obj.sum(mult, 2);
	System.out.println("sum is- "+sum1);
	int sum2=obj.sum(sum1, 2);
	System.out.println("again sum is- "+sum2);
	int sub=obj.sub(sum2, 2);
	System.out.println("subtract is- "+sub);
	obj.divide(sub, 2);

		
	}
}

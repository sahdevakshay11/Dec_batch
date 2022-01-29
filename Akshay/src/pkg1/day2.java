package pkg1;

public class day2 {
	public int multi(int a,int b){
		int c;
		c=a*b;
		System.out.println("multiple is "+c);
		return c;
	}
	public int sum(int a,int b){
		int c;
		c=a+b;
		System.out.println("sum is "+c);
		return c;
	}
	public int sub(int a,int b){
		int c;
		c=a-b;
		System.out.println("subtraction is "+c);
		return c;
	}
	
	public void divide(int a,int b){
		int c;
		c=a/b;
		System.out.println("the final result is "+c);
		
	}
public static void main(String[] args) {
	day2 obj=new day2();
	int multi=obj.multi(10, 2);
	int sum1=obj.sum(multi, 2);
	int sum2=obj.sum(sum1, 2);
	int sub=obj.sub(sum2, 2);
	obj.divide(sub, 2);
}
}
//(10*2)+2)+2)-2)/2)))))
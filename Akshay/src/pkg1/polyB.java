package pkg1;

public class polyB extends polyA {
	
	public int arithmatic(int a,int b){
		int c;
		c=a*b;
		return c;
	}
public static void main(String[] args) {
	polyB obj=new polyB();
	obj.arithmatic(2, 2);
	
	System.out.println("value is = "+obj.arithmatic(2, 2));
	obj.arithmatic(2, 2, 2);
	System.out.println("value is = "+obj.arithmatic(2, 2, 2));
}
}

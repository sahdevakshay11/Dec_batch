package pkg1;

public class day3 {
public void m0() {
	
System.out.println("default method");	
}

public void m1(int a) {
	
System.out.println("one parameterized method");	
}

public void m2(int a,int b) {
	this.m3(3, 5, 8);
	this.m4(5, 6, 9, 2);
	this.m0();
	this.m1(2);
System.out.println("two parameterized method");	
}

public void m3(int a,int b,int c) {
	
System.out.println("three parameterized method");	
}

public void m4(int a,int b,int c,int d) {
	
System.out.println("four parameterized method");	
}

public static void main(String[] args) {

	day3 obj=new day3();
	obj.m2(1,2);
}
}





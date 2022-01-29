package pkg1;

public class ClassB extends ClassA {
	public ClassB(){
		this(1,2);
		System.out.println("Child default constructor");
	}

	public ClassB(int a){
		this(1,2,3);
		System.out.println("Child 1 parameterized constructor");
	}
	public ClassB(int a,int b){
		super(1,2);
		System.out.println("Child 2 parameterized constructor");
	}
	public ClassB(int a,int c,int b){
		this();
		System.out.println("Child 3 parameterized constructor");
	
}
	public static void main(String[] args) {
		ClassB obj=new ClassB(1);
		
	}
}

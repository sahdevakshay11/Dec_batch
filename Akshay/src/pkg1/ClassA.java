package pkg1;

public class ClassA {
public ClassA(){
	this(1,2,3);
	System.out.println("Parent default constructor");
}

public ClassA(int a){
	this();
	System.out.println("Parent 1 parameterized constructor");
}
public ClassA(int a,int b){
	this(1);
	System.out.println("Parent 2 parameterized constructor");
}
public ClassA(int a,int c,int b){
	System.out.println("Parent 3 parameterized constructor");
}
//public static void main(String[] args) {
//	
//}

//parent 3 parameterized constructor
//parent default constructor
//parent 1 parmarterized constructor
//parent 2 parmaeterized constructor
//child 2 parmaeterized constructor
//child default constructor
//child 3 parmaeterized constructor
//child 1 parmaeterized constructor
}

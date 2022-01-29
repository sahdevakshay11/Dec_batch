package pkg1;

public class student {
	int rollno;
	int age;
	
	public void display1(){
		System.out.println("Welcome to all of you");
		
	}
public void display2(){
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		student obj=new student();
		obj.rollno=12;
		System.out.println(obj.rollno);
		obj.age=19;
		System.out.println(obj.age);
		
		obj.display1();
		obj.display2();
	}

}

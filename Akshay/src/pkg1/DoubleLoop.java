package pkg1;

public class DoubleLoop {

	public void method1(){
		
		for (int i=0;i<=6;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		DoubleLoop obj=new DoubleLoop();
		obj.method1();
	}
}

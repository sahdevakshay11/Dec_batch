package pkg1;

public class Armstrong {

	public void method1(int number){
		int old_number=number;
		int sum=0;
		
		while(number>0){
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
			
		}
		if(old_number==sum){
			System.out.println("its a Armstrong number");
			
		}
		else{
			System.out.println("Not a Armstrong number");
		}
		
	}
	public static void main(String[] args) {
		Armstrong obj=new Armstrong();
		
		obj.method1(153);
	}
}

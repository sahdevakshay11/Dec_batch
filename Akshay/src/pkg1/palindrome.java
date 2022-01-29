package pkg1;

public class palindrome {
	
	public void method1(int number){
		int old_number=number;
		int sum=0;
		
		while(number>0){
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
			}
		
		if(old_number==sum){
			System.out.println(+old_number+" Number is PALINDROME");
			
		}
		else{
			System.out.println(+old_number+" Not a PALINDROME");
		}
	}
	public static void main(String[] args) {
		
		palindrome obj=new palindrome();
		obj.method1(1551);
		
	}

}

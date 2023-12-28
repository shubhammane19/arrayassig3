import java.util.*;

class ArmStrong2{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int temp1 = num;
		int temp2 = num;
		int count = 0;
		while(temp1!= 0){
			
			count++;
			temp1 = temp1/10;
		}
		
		int sum = 0;
		while(temp2!=0){
			
			int mult = 1;
			int rem = temp2%10;
			int p  = 1;
			while(p<=count){
				
				mult = mult*rem;
				p++;
			}
			sum = sum+mult;
			temp2 = temp2/10;
		}
		
		if(sum == num){
			System.out.println(num + " is an ArmStrongNo");
		}else{
			System.out.println(num + " not an ArmStrongNo");
		}
	}
}
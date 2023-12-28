import java.util.*;

class Program9{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size  = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();

		}
		
		System.out.println("Armstrong element in the array is:");
		for(int i = 0; i<arr.length; i++){
			
			int temp1 = arr[i];
			int count = 0;
			int temp2 = arr[i];
			while(temp1 != 0){
				
				count++;
				temp1 = temp1/10;
			}
			int sum = 0;
			while(temp2!=0){
				
				int mult = 1;
				int rem = temp2%10;
				int p = 1;
				while(p<=count){
					
					mult = mult*rem;
					p++;
				}
				sum = sum+mult;
				temp2 = temp2/10;
			}
			if(sum == arr[i])
				System.out.println(arr[i] + " is an ArmStrongNumber at index:" + i);
		}	
	}
}
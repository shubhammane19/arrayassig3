import java.util.*;

class Program9{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size  = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
			//int temp2 = arr[i];
		}
		
		System.out.println("Armstrong element in the array is:");
		
		for(int i=0; i<arr.length; i++){
			int temp = arr[i];
			int tempnum = temp;
			int count = 0;
			while(tempnum != 0){
				count++;
				tempnum = tempnum/10;
			}
			int sum =0;
			
		int num = arr[i];
		
		while(num != 0){
			
			int mult = 1;
			int rem = num%10;
			int p = 1;
			while(p<=count){
				
				mult = mult*rem;
				p++;
			}
			sum = sum + mult;
			num = num/10;
		}
		
			if(sum == arr[i]){
				System.out.println(num);
			}
		}
	}
}
import java.util.*;

class Program4{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size:");
		int size = sc.nextInt();
		// int even = 0;
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		int even =0;
		for(int i=0; i<size; i++){
			
			if(arr[i]%2 == 0){
				
				System.out.print(arr[i] + " ");
			}
			// System.out.println("Even Numbers :" + even);
		}
		// System.out.println();
	}
}
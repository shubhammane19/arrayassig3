import java.util.*;

class Program7{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size:");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i =0; i<size; i++){
			
			sum  = sum + arr[i];
		}
		System.out.println(sum);
	}
}
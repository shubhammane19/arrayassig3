import java.util.*;

class Program5{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size:");
		int size= sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		
		for(int i=0; i<size; i++){
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Max Element: " + max);
	}
}
import java.util.*;

class SumofEvenOdd{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		
		int esum = 0;
		int osum = 0;
		
		for(int i=0; i<size; i++){
			
			if(arr[i]%2 == 0){
				
				esum = esum+ arr[i];
			}else{
				
				osum = osum + arr[i];
			}
		}
		System.out.println("sum of even count: " + esum);
		System.out.println("sum of odd count: " + osum);
	}
}
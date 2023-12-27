import java.util.*;

class Program11{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++){
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<size-1; i++){
			
			for(int j =0; j<size-i-1;j++){
			
				if(arr[j]>arr[j+1]){
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		 System.out.println("Array in ascending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
		}
	}
}
import java.util.*;

class MergeArray{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array1 size:");
		int size1 = sc.nextInt();
		
		System.out.println("Enter array2 size:");
		int size2 = sc.nextInt();
		
		int mergeSize = size1+size2;
		
		int arr1[] = new int[size1];
		System.out.println("Enter array1 elements:");
		
		for(int i= 0; i<size1 ; i++){
			
			arr1[i] = sc.nextInt();
		}
		
		int arr2[] = new int[size2];
		System.out.println("Enter array2 elements:");
		
		for(int i= 0; i<size2;i++){
			
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = new int[mergeSize];
		
		for(int i = 0; i<size1; i++){
			
			arr3[i] = arr1[i];
		}
		
		for(int i = 0; i<size2; i++){
			
			arr3[size1+i] = arr2[i];
		}
		
		System.out.println("MergedArray:");
		for(int i =0; i<mergeSize; i++){
			
			System.out.print(arr3[i] + " ");
		}
		
		
	}
}
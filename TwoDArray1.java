import java.util.*;

class TwoDArray1{
	
	public static void main(String[] args){
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows:");
		int rows = sc.nextInt();
		
		System.out.println("Enter Number of Columns:");
		int col = sc.nextInt();
		
		int arr[][] = new int[rows][col];
		
		for(int i=0; i<rows; i++){
			
			for(int j=0; j<col; j++){
				
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++){
			
			for(int j=0; j<col; j++){
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
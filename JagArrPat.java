import java.util.*;
import java.io.*;

class JagArrPat{
	
	public static void main(String[] args)throws IOException{
		
		//Scanner sc  = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows:");
		int rows = Integer.parseInt(br.readLine());
		
		char arr[][]  = new char[rows][];
		
		for(int i=0; i<rows; i++){
			
			System.out.println("Enter number of columns" + (i+1) + ":");
			int col = Integer.parseInt(br.readLine());
			arr[i] = new char[col];
		}
		
		//System.out.println("ENter Elements:");
		for(int i =0; i<arr.length; i++){
			
			for(int j= 0; j<arr[i].length; j++){
				
				arr[i][j] = '*';
			}
		}
		System.out.println("Jagged Array:");
		for(int i = 0; i<rows; i++){
			
			for(int j =0; j<arr[i].length;j++){
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
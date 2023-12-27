import java.util.*;

class Program10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size  = sc.nextInt();
        
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Armstrong elements in the array are:");
        
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            
            int count = 0;
            int tempNum = temp;
            while (tempNum != 0) {
                count++;
                tempNum = tempNum / 10;
            }
            
            int sum = 0;
            int num = arr[i];
            
            while (num != 0) {
                int rem = num % 10;
                int mult = 1;
                
                // Calculate power using Math.pow function
                for (int j = 0; j < count; j++) {
                    mult *= rem;
                }
                
                sum += mult;
                num = num / 10;
            }
            
            if (sum == arr[i]) {
                System.out.println(arr[i] + " is an Armstrong number at index: " + i);
            }
        }
    }
}

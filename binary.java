import java.util.Scanner;
public class binary{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {1, 2, 3, 4, 5, 6, 7,};
        System.out.println("Enter the element");
        int input=sc.nextInt();
        
        int result =0 ;
        int low=0;
        int high= arr.length-1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;
        
        if (arr[mid] ==input){
            System.out.println(mid + " index ");
            found = true;
            break;
        }
        else if (arr[mid]> input){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
    
        }
        if(!found){
            System.out.println(result = -1);            
        }
    
    }
}
import java.util.Scanner;
public class lab3{
    public static void main ( String [] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int target = sc.nextInt();
        int [] arr = {2,4,7,8};
        boolean found = false;
        
        for (int i =0; i<arr.length; i++){
            for (int j= i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){

                
                System.out.println("output " + i + " and " + j);
                found = true;
                break;
            }
        }
    }
        if(!found){
            System.out.println("not element");
        }
        sc.close();
    }
}
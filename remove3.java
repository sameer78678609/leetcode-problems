import java.util.Scanner;
public class remove3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element ");
        int input = sc.nextInt();

        boolean found = false;
        

        int [] arr= {1, 2, 3, 4, 5, 5, 2, 6 ,4  };
        for(int i =0 ; i<arr.length; i++){
            if(arr[i] == input){
                found = true;
                continue;
            }
            System.out.print(  arr[i] +" " );
        }
        if(!found){
            System.out.println("Not exist element");
        }

    }
}
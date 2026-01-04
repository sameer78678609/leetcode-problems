import java.util.Scanner;
public class search3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();

        int pos =0;
        boolean found = false;
        int [] a ={1, 3, 4, 5, 7, };
        for(int i= 0; i<a.length; i++  ){
            if(a[i] == target ){
                found = true;
                System.out.print(i +" " + "position ");
                break;   
            }
            else if(a[i] >target ){
                pos = i+1;
                break;
            }
            else{
                pos=i;
            }
            
        }
        if(!found){
            System.out.println("not found element insert at position  " + pos);
        }
        
        }
}
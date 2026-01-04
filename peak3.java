public class peak3{
    public static void main(String[] args) {
        int [] arr={1, 2, 4, 3, 6, 7, 5, 9, 8};
    
        int low=0;
        int high= arr.length-1;
        
        while(low<high){
            int mid = (low+high)/2;

            if(arr[mid] > arr[mid+1]){
                high = mid;
    
            }
            else{
                low= mid+1;
            }
        }
        System.out.println(arr[low] + " element ");
    }
}
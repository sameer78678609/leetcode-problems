import java.util.Scanner; 
public class duplicate { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the element"); 
int input = sc.nextInt(); 
int [] a= {1,2,3,4,1}; 
boolean found = false; 
for(int i=0; i<a.length; i++){ 
if (input== a[i]){ 
System.out.println("Duplicate "); 
found = true; 
break; 
} 
else if(input != a[i]){ 
System.out.println("Not duplicate"); 
found = false; 
break;  
} 
sc.close();   
}     
} 
} 
import java.util.Scanner;  
public class consecutive { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Enter any number (optional):"); 
int input = sc.nextInt(); 
int[] arr = {1, 0, 1, 1, 1, 0, 0}; 
int maxcount = 0; 
int currentcount = 0; 
for (int num : arr) { 
if (num == 1) 
{ 
currentcount++; 
if (currentcount > maxcount) { 
maxcount = currentcount; 
} 
} else { 
currentcount = 0; 
} 
} 
System.out.println("Max consecutive ones: " + maxcount); 
sc.close(); 
} 
} 
package Array;
import java.util.Scanner;
public class Simple {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n value:");
        int n = sc.nextInt();
        System.out.println("You Enter "+n+" value:");
        
        int a []= new int[n];

        for (int i=0; i<n; i++){
            // System.out.print(" Index is: a["+i+"] = ");
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        // a.length;
        System.out.println("Total Array length is : "+a.length);

        // for (int i=0; i<a.length; i++){
        //     System.out.println("Array index is "+a[n]+" Value is "+a[i]);
        // }
        

    }
    
}

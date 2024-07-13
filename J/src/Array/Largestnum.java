package Array;

import java.util.Arrays;
import java.util.Scanner;

class Largestnum {
    
    static int n;
    static int []x;
    
    static int Largest(){
        Scanner sc =new Scanner(System.in);
        
        System.out.print("How many Number Value Print : ");
        
        // if(sc.hasNextLine()){
            n = sc.nextInt();
        // }
        x = new int[n];
        System.out.println("Total Array is: "+n);

        for(int i=0; i<n; i++){
            System.out.printf("Enter Array index value a[%d] =  ",i);
                if(sc.hasNextLine()){
                    x[i]=sc.nextInt();
                }

//                System.out.println(i);
        }
        System.out.println(Arrays.toString(x));
        
        int i;
        int max = x[0];
        for(i=1; i < x.length; i++)
            if(x[i]>max)
                max = x[i];
                return max;

    }
    public static void main(String args[]){
        
        System.out.printf("Lagest value is   = "+Largest());
    }
}
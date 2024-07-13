package Array;

import java.util.Arrays;

public class jaggedarray {
    public static void main(String[] args){

        int x[][] = new int [4][];

        x[0]=new int[2];
        x[1]=new int[4];
        x[2]=new int[3];
        x[3]=new int[5];

        // x[0]= 4;
        // x[1]= 5;
        // x[2]= 2;
        // x[3]= 1;



        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){

                x[i][j] = (int)(Math.random() * 10); 
                System.out.print(x[i][j]+" | ");
            }
            System.out.println();
        } 

        // for(int i=0; i<x.length; i++){
            
        //         System.out.print(x[i]+" | ");
        //     System.out.println();
        // } 
        
        // for(int n[] : x){
        //     for(int m:n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        //     // System.out.println(Arrays.toString(n)+"::");
        // }
    
    }
}


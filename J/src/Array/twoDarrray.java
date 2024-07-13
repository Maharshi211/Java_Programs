package Array;
import java.io.*;
import java.util.*;

public class twoDarrray {
    public static void train(int mat[][]){

        for(int[] row:mat)
        System.out.println(Arrays.toString(row));

    }

    public static void main(String args[])
        throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 } };
        train(mat);
    }
    
}

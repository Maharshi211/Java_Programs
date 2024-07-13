package Array;
public class AddtwoMatrix {
    static void printMatrix(int x[][], int rowsize, int colsize) {
        for (int i = 0; i < rowsize; i++) {
            for (int j = 0; j < colsize; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] add(int a[][], int b[][],int size) {
        int i,j;
        int c[][] = new int[size][size];

        for(i=0; i<size; i++)
            for(j=0; j<size; j++)
                c[i][j] = a[i][j]+b[i][j];

        return c;


    }

    public static void main(String[] args) {

        int size = 3;
        int a[][] = {
            {1,1,1},
            {2,2,2},
            {3,3,3}
        };
        int b[][] = {
            {1,1,1},
            {2,2,2},
            {3,3,3}
        };

        printMatrix(a, size, size);
        System.out.println();
        printMatrix(b, size, size);
        System.out.println();

        int c[][] = add(a,b,size);
        printMatrix(c, size, size);
    
    }    
}

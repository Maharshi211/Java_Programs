package Array;

public class Matrixarray {
    public static void main(String [] args){

        // int[][] x = {{21,31,91},{65,42,14},{32,54,76},{53,75,22}};
         int[][] y = {{1,2,3},{4,5,6},{7,8,9}};
        // int z[][] = new int[3][3];
//        int[][] y =  new int[5][5];
        int i,j,sum = 0,sum1=0;

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
//                y[i][j] = (int)(Math.random() * 10); 
                System.out.print(y[i][j]+" | ");
            }
            System.out.println();
        }

        //int sum = y[0][0] + y[1][1] + y[2][2];
       // System.out.println(sum+" ");

       for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i == j){
                    System.out.print( y[i][j] + " "); 
                    // System.out.print( y[i][j] * y[i][j]+ " "); 
                    }
            }
        }

        System.out.println();

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i == j){
                    System.out.print( y[i][j] * y[i][j] + " "); 
                    // System.out.print( y[i][j] * y[i][j]+ " "); 
                    }
            }
        }
        
        System.out.println();
        
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i == j){
                    int s =  y[i][j];
                    sum += s;
                }
            }
        }
        
        
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                
                if(i == j){
                    int sq =  y[i][j] * y[i][j];
                    sum1 += sq;
                }
            }
        }
        // System.out.println();
        System.out.print("Matrix Diagonal Numbers SUM ");
        System.out.println(sum);
        System.out.print("Matrix Diagonal Numbers Square SUM ");
        System.out.println(sum1);

    }
}

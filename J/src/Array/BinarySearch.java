package Array;
public class BinarySearch {
    public static void main(String args[]){

        Integer [] num = {11,2,4,16,8};
        int key = 16;
        int l = 0;
        int h = num.length-1;
        boolean flag = false;
        int temp; 

        while(l<=h){
            for(int i=0; i<num.length; i++){
                for(int j=i+1; j<num.length; j++){
                    if(num[i]>num[j]){
                        temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                    }
                }
            }

            int m = (l+h)/2;

            if(num[m] == key){
                flag = true;
                System.out.println(num[m]+ "::"+m);
                break;
            }

            if(num[m] >= key){
                h = m-1;
            }

            if(num[m]<=key){
                l = m+1;
            }

        }

        if(flag == false){
            System.out.println("NON");
        }

    }
    
}

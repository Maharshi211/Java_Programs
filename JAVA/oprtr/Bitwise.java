package oprtr;
import java.util.Scanner;

public class Bitwise {
    public static void  main(String args[]){

        int a,b;
        int result=0;

        Scanner s = new Scanner(System.in);
        System.out.println("Value of a is : ");
        a=s.nextInt();
        System.out.println("Value of b is : ");
        b=s.nextInt();

        result = a&b;
        System.out.println(result);
        result = a|b;
        System.out.println(result);
        result = a^b;
        System.out.println(result);
        result = ~b;
        System.out.println(result);
        result = a<<b;
        System.out.println(result);
        result = a>>b;
        System.out.println(result);
    }

}

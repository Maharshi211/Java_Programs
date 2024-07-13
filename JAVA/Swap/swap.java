package Swap;
import java.util.Scanner;

class swap{
	public static void main(String[] args)
	{
        int temp,x,y;
		Scanner s = new Scanner(System.in);

		System.out.println("Before Swap:");
		System.out.println("x = ");
        x = s.nextInt();
		System.out.println("y = ");
        y = s.nextInt();

        temp=x;
        x=y;
        y=temp;

		System.out.println("After swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

        int a=90,c=20;
        System.out.println("Before Swap variable Value a= "+a +" And c= "+c);
       a=a+c;
       c=a-c;
       a=a-c;

        System.out.println("After Swap variable Value a= "+a +" And c= "+c);
	}
}

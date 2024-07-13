//package class;
//import java.*;
class New{
    public int add(int n1,int n2,  int n3){
        return n1 + n2 + n3;
    }

    public float add(float a0,float a1){
        return a0*a1;
    }
}

public class Methodoverloading{
    public static void main(String args[]){
        New q = new New();

        int re = q.add(10,290,38);
        float  r1 = q.add(155,2);

        System.out.println(re);
        System.out.println(r1);
    }

}

class Computer{

    public void device(){
        System.out.print("Super COmputer");
        this.disk(1010);
    }

    public String disk(int cost){

        System.out.println(cost);
        this.device();
        return "Ram + Rom";
    }
}

public class Method{
    public static void main (String args[]){

        Computer com = new Computer();

        com.device();
        String str = com.disk(10099);

        System.out.println(str);

    }

}
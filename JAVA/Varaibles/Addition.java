package Varaibles;

class ia {
    int a;
    int b;
    int c;
    
    void show(int x, int y) {
        a = x;
        b = y;
    }

    void add() {
        System.out.println("fseufgyeur " + (a + b));
    }
}

public class Addition {
    public static void main(String[] args) {

        ia a = new ia();
        a.show(3, 4);
        a.add();
        
        Math vM = new Math();
        
        vM.insert(42, 57);
        vM.add();
        
       

    }

}

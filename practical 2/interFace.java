interface I {
    void show();
    void disp();
}

class A implements I {
    public void show(){
        System.out.println("Show mehtod");
    }
     public void disp() {
        System.out.println("Disp Method");
    }
} 

public class interFace {
    public static void main(String[] args) {
        I obj = new A();
        obj.show();
        obj.disp();
    }
}

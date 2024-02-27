public class method {
    public static void show(){
        System.out.println("Basic Printi Statement");
    }
    public static void show(String Name) {
        System.out.println("This is Parameter Methos with name "+Name);
    }
    public static void show(int x,int y) {
        System.out.println("Area of Rectangle "+(x+y));
    }
    public static void show(String clg, int clg_Code){
        System.out.println("College naem is "+clg +" And Code is "+clg_Code);
    }

    public static void main(String[] args) {
        method obj = new method();
        obj.show();
        obj.show("Shivam");
        obj.show("SIES",1028);
        obj.show(5, 10);
    }
}

public class staticMethod {
    public static void disp(){
        System.out.println("Static Method Example");
    }
    static int func() {
        return 3*10;
    }
    public static void main(String[] args) {
        System.out.println(func());
        staticMethod obj = new staticMethod();
        obj.disp();
    }
}

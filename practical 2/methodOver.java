class Car {
    public static void brandName(){
        System.out.println("Skoda");
    }
    public static void rating(){
        System.out.println("* * * * *");
    }
}

public class methodOver extends Car {
    public static void brandName() {
        System.out.println("Suzuki");
    }
    public static void main(String[] args) {
        methodOver obj = new methodOver();
        obj.brandName();
        obj.rating();
    }
}

abstract class shape {
  abstract void draw();
}

class circle extends shape {
    void draw()
    {
        System.out.println("Draw Circle");
    }
}
class rectangle extends shape {
    void draw(){
        System.out.println("Draw Rectangle");
    }
}
public class abstractClass {
   public static void main(String[] args) {
    shape s1 = new circle();
    s1.draw();
    shape s2 = new rectangle();
    s2.draw();
   }
}

public class constt {
    int x = 100;
    public constt(){
        int x= 10;
        System.out.println(x);
    }    
    public constt(int x, int y){
        System.out.println("X is "+x);
        System.out.println("Y is "+y);
    }
    public constt(constt obj){
        x = this.x;
        System.out.println(x);
    }
    public static void main(String[] args) {
        constt obj = new constt();
        constt obj2 = new constt(20,30);
        constt obj1 = new constt(obj);
    }
}
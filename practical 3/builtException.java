
public class builtException {
    public static void main(String[] args) {
    try {
        int x = 10;
        int y = 2;
        int ans = x/y;
        int arr[] = {2,4,5,6,7,7,8,9};
        System.out.println(ans);
        System.out.println(arr[12]);
    }
    catch(ArithmeticException obj) {
        System.out.println("Devide by Zero Exception" + obj);
    }
    catch(ArrayIndexOutOfBoundsException obj){
        System.out.println(obj);
    }
  }
}

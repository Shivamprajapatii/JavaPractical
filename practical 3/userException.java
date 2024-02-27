class userExceptionExample extends Exception {
    public userExceptionExample(String msg){
        super(msg);
    }
}

public class userException {
    public static void main(String[] args) {
        try {
            throw new userExceptionExample("End Of Class");
        }
        catch(userExceptionExample e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Program Executed");
        }
    }
}

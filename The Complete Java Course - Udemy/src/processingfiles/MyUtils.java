package processingfiles;

public class MyUtils {

    public int subtract10FromNum(int num) throws MyExceptionName{

        if (num < 10){
            throw new MyExceptionName("Oops! The number is smaller than 10.");
        }
        return num - 10;
    }

    // Creating my own Exception:
    public class MyExceptionName extends Exception{
        public MyExceptionName(String s) {
            super(s);

        }
    }
}

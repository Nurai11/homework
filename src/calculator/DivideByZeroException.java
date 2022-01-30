package calculator;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(){

    }

    public DivideByZeroException(String message){
        super(message);
    }
}

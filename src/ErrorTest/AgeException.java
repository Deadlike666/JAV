package ErrorTest;

public class AgeException extends Exception{
    public AgeException(){
        super("Age over");
    }
    public AgeException(String message){
        super(message);
    }
}

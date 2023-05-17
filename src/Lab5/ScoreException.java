package Lab5;

public class ScoreException extends Exception{
    public ScoreException(){
        super("Score Exceptin!");
    }
    public ScoreException(String message){
        super(message);
    }
}


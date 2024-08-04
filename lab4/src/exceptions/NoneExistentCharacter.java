package exceptions;

public class NoneExistentCharacter extends RuntimeException{
    public NoneExistentCharacter(String message){
        super(message);
    }
}


/**
 * Write a description of class PasswordException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasswordException extends Exception
{
    
    public StringInput input;
    
    public PasswordException(String message)
    {
        super(message);
        input = new StringInput();
    }
    
    public String enterData(){
        System.out.print("Enter password: ");
        return input.enterData();
    }
}

import java.util.ArrayList;
/**
 * Write a description of class PasswordDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PasswordDB
{
    
    ArrayList<User> users;
    StringInput input;
    
    public PasswordDB()
    {
        users = new ArrayList<User>();
        input = new StringInput();
    }
    
    public void newUser(String nm, String un, String em, String pwd){
        boolean error = false;
        if(!error){
            error = checkUsername(un);
        }
        if(!error){
            error = checkPassword(pwd);
        }
        if(!error){
            error = checkEmail(em);
        }
        if(!error){
            users.add(new User(nm, un, em, pwd));
        }
    }
    
    public boolean checkUsername(String un){
        for(User u : users){
            if(un.equals(u.getUsername())){
                return true;
            }
        }
        return false;
    }
    
    public boolean checkPassword(String pwd){
        if(pwd.length() < 8){
            return true;
        }
        return false;
    }
    
    public boolean checkEmail(String em){
        if(em.indexOf("@") <= 0){
            return true;
        }
        return false;
    }
}

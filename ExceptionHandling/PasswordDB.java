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
    
    public void newUser(){
        String name;
        String username;
        String email;
        String password;
        boolean error = true;
        System.out.print("Enter name: ");
        name = input.enterData();
        System.out.print("Enter username: ");
        username = input.enterData();
        System.out.print("Enter email: ");
        email = input.enterData();
        System.out.print("Enter password: ");
        password = input.enterData();
        while(!checkUsername(username)){
            System.out.print("Enter username: ");
            username = input.enterData();
        }
        while(error){
            error = false;
            try{
                checkPassword(password);            
            } catch (PasswordException ex){
                System.out.println(ex.getMessage());
                error = true;
                System.out.print("Enter password: ");
                password = input.enterData();
            }
        }
        while(!checkEmail(email)){
            System.out.print("Enter email: ");
            email = input.enterData();
        }        
        users.add(new User(name, username, email, password));        
        System.out.println("Success");
    }
    
    public void findUser(){
        String username;
        boolean found = false;
        System.out.print("Enter username: ");
        username = input.enterData();
        for(User u : users){
            if(username.equals(u.getUsername())){
                found = true;
            }
        }
        if(found){
            System.out.println("The user has been found");
        }else{
            System.out.println("The user was not found");
        }
    }
    
    public boolean checkUsername(String un){
        for(User u : users){
            if(un.equals(u.getUsername())){
                System.out.println("Username is not unique");
                return false;
            }
        }
        return true;
    }
    
    public boolean checkPassword(String pwd) throws PasswordException{
        if(pwd.length() < 8){
            throw new PasswordException("Password must be longer than 8 characters");
        }
        return true;
    }
    
    public boolean checkEmail(String em){
        if(em.indexOf("@") <= 0){
            System.out.println("Invalid email");
            return false;
        }
        return true;
    }
}

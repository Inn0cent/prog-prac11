
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class User
{
    
    private String name;
    private String username;
    private String email;
    private String password;
    
    public User(String nm, String un, String em, String pwd)
    {
        name = nm;
        username = un;
        email = em;
        password = pwd;
    }
    
    public String getUsername(){
        return username;
    }
}

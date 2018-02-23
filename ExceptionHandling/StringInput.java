import java.io.*; 

public class StringInput 
{ 
    private BufferedReader reader; 
     
    public StringInput() 
    { 
        reader = new BufferedReader(new InputStreamReader(System.in)); 
    } 
 
 
    public String enterData() throws IOException 
    {          
        String input = reader.readLine();
        return input;                        
    } 
} 

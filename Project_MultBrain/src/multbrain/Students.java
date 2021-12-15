package multbrain;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Students implements Human{
    private String firstName;
    private String lastName;
    private String userId;
    private int currentID;
    
    Students(String fName, String lName){
        try{
            
            File idRecord = new File("idRecord.txt");
            
            if(idRecord.createNewFile()){
                System.out.println("File created: " + idRecord.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            Scanner myRead = new Scanner(idRecord);
            currentID = myRead.hasNext()? myRead.nextInt()+ 1: null ;
            
            System.out.println(currentID);
            
            FileWriter myWriter = new FileWriter("idRecord.txt");
            myWriter.write(Integer.toString(currentID));
            myWriter.close();
                
        }catch(IOException e){
            System.out.println(e);
            return;
        }
        
        firstName = fName;
        lastName = lName;
        userId = Integer.toString(currentID);
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    public String getUserId(){
        return userId;
    }
    public boolean getStatus(){
        return false;
    }
}

package multbrain;
import java.util.ArrayList;

public class Mode {
    //common features here
    private String student;
    private ArrayList<String> testedOn = new ArrayList<String>();

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    
    Mode(String student) {
        this.student = student;
    }
    
    public ArrayList<String> getTestedOn() {
        ArrayList<Integer> tables;
        tables = selectNumbers.getSelectedNumbers();
        
        for(Integer i : tables){
            for(int j=1; j < 13; j++){
               testedOn.add(Integer.toString(i) + ',' + Integer.toString(j));
            }
        }
        
        return testedOn;
    }
}

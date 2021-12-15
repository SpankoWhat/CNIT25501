package multbrain;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TestMode extends Mode{
    
    private ArrayList<String> questionList;

    private int step;
    private int answer;    
    int mistake = -1;
    public Boolean excersieDone = false;
    
    TestMode(String student){
       super(student);

       questionList = super.getTestedOn();
    }    
    
    public Boolean getExcersieDone() {
        return excersieDone;
    }

    public void setExcersieDone(Boolean excersieDone) {
        this.excersieDone = excersieDone;
    }
    
    public ArrayList<String> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<String> questionList) {
        this.questionList = questionList;
    }
    
    public void displayScore(){
        int number = questionList.size();
        int correct = (number - mistake);
        
        JOptionPane.showMessageDialog(null,
                "Score: " + (correct/(float)number) * 100 + 
                " | Mistakes: " + mistake + 
                " | Correct: " + correct
        );
    }
    
    public void testMe(String def, Boolean answer){
        String[] splitedUp;
        
        if(step == questionList.size()){
            excersieDone = true;
        }
        
        if (def.equals("q") & step < questionList.size()){
            
            splitedUp = questionList.get(step).split(",");
            inputScreen.question = splitedUp[0] + "x" + splitedUp[1];
            step += 1;
        }
        
        if(!answer){
            mistake += 1;
        }
    }
}

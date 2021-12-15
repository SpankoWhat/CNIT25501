package multbrain;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PracticeMode extends Mode{
    
    private ArrayList<String> questionList;

    private int step;
    private int answer;
    int mistake;
    public Boolean excersieDone = false;
    
    PracticeMode(String student){
       super(student);  
"one".equals("dd");
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
        JOptionPane.showMessageDialog(null,
                "Score: " + (mistake/number)* 100 + 
                " | Mistakes: " + mistake + 
                " | Correct: " + (number - mistake)
        );
    }
    
    public void testMe(String def, Boolean answer)
    {
        String[] splitedUp;
        
        if(answer){
            step += 1;
        }
        
        if (def.equals("q") & step < questionList.size())
        {
            splitedUp = questionList.get(step).split(",");
            inputScreen.question = splitedUp[0] + "x" + splitedUp[1];
        }
        
        if(step == questionList.size())
        {
            excersieDone = true;
        }
    }
}
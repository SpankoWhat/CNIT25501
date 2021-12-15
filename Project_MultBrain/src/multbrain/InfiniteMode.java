package multbrain;

import java.util.ArrayList;

public class InfiniteMode extends Mode{
    private ArrayList<String> questionList;

    private int step;
    private int answer;
    public Boolean excersieDone = false;
    
    InfiniteMode(String student){
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
    
    public void testMe(String def, Boolean answer){
        String[] splitedUp;
        
        if (def.equals("q")){
            splitedUp = questionList.get(step).split(",");
            inputScreen.question = splitedUp[0] + "x" + splitedUp[1];
            step += 1;
            
            if (step == questionList.size()){
                step = 0;
            }
        }
        
    }
    
}

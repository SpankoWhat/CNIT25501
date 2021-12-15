/*
Icons made by https://www.flaticon.com/authors/freepik
*/
package multbrain;

public class MultBrain {

    public static void main(String[] args) {
        new MainMenu().setVisible(true);      
    }

}
//Helped by friend named: Mentlegen(aka: Ali Derbas)
//Endurance mode - like infinite but one mistake + time - should have all, random all.
    //min 50 points - add goal, increase goal when reached (by linear)
    //10 sec min - adjustable by instructer
    //Endurance 10 Second mode - normal
    //Endurance 5 Second mode - hard
    //And Endurance free play - easy

//Score system(class) - point per sec (points per min) uses object(mistake)
    //based of dif
//Object -> store mistakes: equation, mistake, attempts, time, mode
//Object -> session: Array[timeavg/questio], student, instructor, mode, object(mistake), score

//Inheretance -> person(student, insturctor), mode(PracticeMode, TestMode, InfiMod, Endurance)
//Graphs, use session info (use data to find average)

//Implement sql database- jdbc -> https://www3.ntu.edu.sg/home/ehchua/programming/java/JDBC_Basic.html
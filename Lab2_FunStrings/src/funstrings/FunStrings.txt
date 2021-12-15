package funstrings;
import java.util.Scanner;

public class FunStrings {
    public static final String START_STRING = "abc def";
    
    public static void prnt(boolean newLine, String string){
        if (newLine){
            System.out.println(string);
            return;
        }
        System.out.print(string);
    }
    
    public static void printHelp(String errorMessage)
    {
        System.err.println(errorMessage);
        System.err.println("Usage - enter one of the following Commands:");
        System.err.println();
        System.err.println("searchText [text]: prints the index of [text] in "
        + "the String, leaves it unchanged.");
        System.err.println("removeText [text] - deletes all occurences of "
        + "[text] in the String.");
        System.err.println("addText [i] [text] - first argument is an integer "
        + "between 0 and and the length of the string; "
        + "adds [text] at that location in the string.");
        System.err.println("reverseText [no argument] - makes the string into "
        + "its mirror image.");
        System.err.println("reverseEachWord [no argument] - like reverseText "
        + "but applies to each command word individually.");
        System.err.println("printString [no argument] - prints the current "
        + "value of the string.");
        System.err.println("enterNewString [text] - overwites whatever the "
        + "string was with [text] instead.");
        System.err.println("quit [no argument] - exits the program.");
        System.err.println("");
    }

    public static String printString(String oldString, String[] commandWords)
    {
        String filler = "";
        if (START_STRING.equals(oldString)){
            filler = "unchanged - ";
        }
        prnt(true, filler + oldString);
        return (filler + oldString);
    }
    
    private static String combineWordsFrom(String[] words, int index)
    {
        String newString = "";
        for(int i = index; i < words.length; i+=1)
        {
            if(i > index)
            {
                newString += " ";
            }
        newString += words[i];
        }
        return newString;
    }
    
    public static String searchText(String oldString, String[] commandWords)
    {
        int index = 0;
        if (commandWords.length < 2){
            printHelp("searchText - requires an argument");
            return null;
        }else{
            String filler = "";
            index = oldString.indexOf(commandWords[1]);
            
            if(START_STRING.equals(oldString)){
                filler = "unchanged -> ";
            }
            prnt(true, filler + Integer.toString(index));
            return (oldString);
        }
    }
    
    public static String removeText(String oldString, String[] commandWords)
    {
        if (commandWords.length < 2){
            printHelp("addText - requires an argument");
            return null;
        }
        return oldString.replace(commandWords[1],"");
    }
    
    public static String addText(String oldString, String[] commandWords)
    {        
        if (commandWords.length < 2){
            printHelp("addText - requires an argument");
            return null;
        }
        int index = Integer.parseInt(commandWords[1]);
        if (index < 0){
            printHelp("addText - invalid index (must be int "
                    + "between 0 and string length): -1");
            return null;
        }

        String splitOne = oldString.substring(0,index);
        String splitTwo = oldString.substring(index);
        return splitOne + commandWords[2]+splitTwo;
    }
    
    private static String reverseString(String s)
    {
        StringBuilder strngBuild = new StringBuilder(); 
        strngBuild.append(s); 
        return (strngBuild.reverse().toString()); 
    }
    
    public static String reverseText(String oldString, String[] commandWords)
    {
        return reverseString(oldString);
    }
    
    public static String reverseEachWord(String oldString, String[] commandWords)
    {
        String[] splitString = oldString.split(" ");
        String combined = "";
        
        for(String ind : splitString)
        {
            combined += reverseString(ind) + " ";
        }
        return combined;
    }
    
    public static String enterNewString(String oldString, String[] commandWords)
    {
        if (commandWords.length < 2)
            {
                printHelp("enterNewString - requires an argument");
                return null;
            }
        return combineWordsFrom(commandWords, 1);
    }

    public static String handleStringCommand(String oldString, String[] commandWords)
    {
    if ("searchText".equals(commandWords[0]))
    {
        return searchText(oldString, commandWords);
    }
    else if ("removeText".equals(commandWords[0]))
    {
        return removeText(oldString, commandWords);
    }
    else if ("addText".equals(commandWords[0]))
    {
        return addText(oldString, commandWords);
    }
    else if ("reverseText".equals(commandWords[0]))
    {
        return reverseText(oldString, commandWords);
    }
    else if ("reverseEachWord".equals(commandWords[0]))
    {
        return reverseEachWord(oldString, commandWords);
    }
    else if ("printString".equals(commandWords[0]))
    {
        return printString(oldString, commandWords);
    }
    else if ("enterNewString".equals(commandWords[0]))
    {
        return enterNewString(oldString, commandWords);
    }
    else
    {
        printHelp("Unknown command: "+commandWords[0]);
        return null;
    }
}

    
    public static void main(String[] args) {
        String theString = START_STRING;
        Scanner s = new Scanner(System.in);
        boolean run = true;
        do
        {
            System.out.print("Enter Command: ");
            String line = s.nextLine();
            String[] commandWords = line.split(" ");
            
            // Handle "quit" specially.
            if ("quit".equals(commandWords[0]))
            {
                run = false;
            }
            else
            {
                // Everything besides quit should be a command that alters
                // ‘theString‘.
                String newString = handleStringCommand(theString, commandWords);
                if (newString != null)
                {
                    theString = newString;
                }
            }
        } while(run == true);
    }   
}

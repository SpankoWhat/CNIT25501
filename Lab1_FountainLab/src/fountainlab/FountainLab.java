package fountainlab;
import java.util.*;
import java.text.NumberFormat;


public class FountainLab {
    public static void prnt(boolean newLine, String string){
        if (newLine){
            System.out.println(string);
            return;
        }
        System.out.print(string);
    }
    
    public static double inputChecker(double min, double max, String desc){
        Scanner in = new Scanner(System.in);
        double number = 0.0;
        
        while(number < min || number > max){
            
            prnt(false, "Please enter the " + desc 
                + " (" + min + " to " + max + "): ");
            
            number = in.nextDouble();
            
                if (number < min || number > max){
                    prnt(true, "(INCORRECT VALUE DETECTED. Please enter a value"
                            + " between " + min + " and " + max + ")");
                }
        }
        return number;
    }
    
    public static void main(String[] args) {
        //variables for user input
        double radius = 5.2;
        double width1 = 0.0;
        double width2 = 0.0;
        double depth = 0.0;
        double cost = 0.0;
        
        //User input
        radius = inputChecker(10.0, 15.0, "radius of the fountain");
        width1 = inputChecker(2.0, 8.0, "rectangular pedestal’s x-axis width");
        width2 = inputChecker(2.0, 8.0, "rectangular pedestal’s y-axis width");
        depth = inputChecker(1.0, 3.0, "water’s depth when full");
                
        
        // Variables required for calculating total volume
        double totalVolume = 0.0;
        double squareVolume = 0.0;
        double circleVolume = 0.0;
        double watergal = 0.0;
        
        //Processing data
        squareVolume = width1 * width2 * depth;
        circleVolume = depth * Math.PI * Math.pow(radius,2);
        totalVolume = circleVolume - squareVolume;
        watergal= totalVolume * 7.481 ;
        
        //printing processed data
        prnt(true, "Water Volume in cubic feet: " 
                + String.format("%.3f",totalVolume));
        prnt(true, "Water Volume in gallons: " 
                + String.format("%.3f",watergal));
        
        //Figuring out cost and printing it
        cost = (Math.ceil(watergal) * 10)/100;
        prnt(true, "That amount of water will cost: " +
                NumberFormat.getCurrencyInstance().format(cost));
    }
    
}

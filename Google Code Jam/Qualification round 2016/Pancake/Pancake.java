import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class Pancake {
    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
		
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfCases = in.nextInt();
        //int numberOfCases = Integer.parseInt(line);
        for (int i = 1; i <= numberOfCases; i++){
            String pancakes = in.next();
            execute(i, pancakes);
        }
    }
    
    public static void flipIt(String[] array, int index){
        for (int i = 0; i <= index; i++){
            if (array[i].equals("+")){
                array[i] = "-";
           } else if (array[i].equals("-")){
               array[i] = "+";
           }
        }
    }
    
    public static boolean checkIfAllHappy(String[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals("-")){
                return false;
           }
        }
        return true;
    }
       
    public static void execute (int num, String pancakes){
       int numOfPancakes = pancakes.length();
       int flip = 0;
       //create pancakes array
       String[] pancakesArray = new String[numOfPancakes];

       for (int i = 0; i < numOfPancakes; i++){
           pancakesArray[i] = pancakes.charAt(i) + "";
       }
       
       //Check If all happy
       if (checkIfAllHappy(pancakesArray)){
           System.out.println("Case #" + num + ": " + flip);
           return;
       }
       int lastPancakeIndex = pancakes.length()-1;
       do {
           if (checkIfAllHappy(pancakesArray)) {
               System.out.println("Case #" + num + ": " + flip);
               return;
            }
           //Get the last unhappy pancake
            for (int i = lastPancakeIndex; i >= 0; i--){
                if (pancakesArray[i].equals("-")){
                    lastPancakeIndex = i;
                    break;
                }
                
            }
            // Flip everything before there.
            flipIt(pancakesArray, lastPancakeIndex);
            flip++;
       } while (1+1 == 2);
    }
    
    
}

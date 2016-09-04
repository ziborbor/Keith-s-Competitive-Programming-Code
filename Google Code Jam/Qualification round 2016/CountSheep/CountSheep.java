import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class CountSheep {
    public static void main(String[] args) throws Exception {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//String line = br.readLine();
        //int numberOfCases = Integer.parseInt(line);
		int numberOfCases = in.nextInt();
        for (int i = 1; i <= numberOfCases; i++){
            int sleep = in.nextInt();
            checkSleep(i, sleep);
            
        }
    }
    
    public static boolean allCount(int[] array){
        for (int i = 0; i < 10; i++){
            if (array[i] < 1){
                return false;
           }
        }
        return true;
    }
    
    
    public static void checkSleep (int num, int sleep){
        if (sleep == 0){
            System.out.println("Case #" + num + ": INSOMNIA");
            return;
        }
        int[] sleepArray = new int[10];
        int multiply = 0;
        allCount(sleepArray);
        while ( !allCount(sleepArray)){
            multiply++;
            String sleepString = sleep * multiply + "";
            for (int i = 0; i < sleepString.length(); i++){
                sleepArray[Integer.parseInt(sleepString.charAt(i) + "")]++;
            }
       }
        
    System.out.println("Case #" + num + ": " + multiply * sleep);
        
    }
    
    
}

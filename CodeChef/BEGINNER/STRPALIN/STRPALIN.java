import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class STRPALIN {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int story = s.nextInt();
        for (int i = 0; i < story; i++){
            String firstWord = s.next();
            String secondWord = s.next();
            boolean pal = false;
            for (int j = 0; j < firstWord.length(); j++){
                if (secondWord.indexOf(firstWord.charAt(j)) >= 0){
                    System.out.println("Yes");
                    pal = true;
                    break;
                }
            }
            if (!pal){
            System.out.println("No");
            }
        }
    }
}
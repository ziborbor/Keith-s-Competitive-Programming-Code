import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int story = s.nextInt();
        for (int i = 0; i < story; i++){
            getTheEvenSum(s.nextInt());
        }

    }
    
    public static void getTheEvenSum(int n){
        int sum = 0;
        //fibonacci
        
        int fibNum = 2;
        int fibPrevNum = 1;
        while (fibNum < n){
             if (fibNum % 2 == 0){
                sum += fibNum;
            }
            int holder = fibNum;
            fibNum = fibNum + fibPrevNum;
            fibPrevNum = holder;
        }
            
        
        System.out.println(sum);
    } 
}
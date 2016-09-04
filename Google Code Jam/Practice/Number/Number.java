import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Number {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
        //double answer = 0;
        for (int i = 1; i <= a; i++){
            int n = sc.nextInt();
            double answer = Math.pow((3 + Math.sqrt(5)) , n); 
          //  System.out.println(answer);
            String answerString = new BigDecimal(answer).toPlainString();
            int dotPoint = answerString.indexOf(".");
			if (dotPoint != -1){
				answerString = answerString.substring(0,dotPoint);
			}
         //   System.out.println(answerString);
            if (answerString.length() > 2){
                answerString = answerString.substring(answerString.length()-3,answerString.length());
            } else if (answerString.length() == 2) {
                answerString = "0" + answerString;
            } else if (answerString.length() == 1) {
                answerString = "00" + answerString;
            }
			
            System.out.println("Case #" + i + ": " + answerString);
      //Complete this line
      //Complete this line
        }
      
      //Complete this line
      //Complete this line
      
    
    }
}

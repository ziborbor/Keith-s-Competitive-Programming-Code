import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Jamcoin {
    public static void main(String[] args) throws Exception {
		System.out.println("Case #1:");
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfCases = in.nextInt();
		int n = in.nextInt();
		int j = in.nextInt();
        //Get the biggest

        String key = getOriginalKey(n);
        //Get the string
        while (j > 0){
            j = j + getjamCoin(key);
            key = getNextKey(key);
        }
       // getjamCoin("1000000010010001")
    
        
    }
    public static String getNextKey(String key){
       String middle = key.substring(1,key.length()-1);
       int middleBinary = Integer.parseInt(middle, 2);
       middleBinary++;
       //convert it back to string
       middle = Integer.toBinaryString(middleBinary);
       String zeroes = "";
       for (int i = 0; i < key.length()-2-middle.length(); i++){
           zeroes += "0";
       }
       return "1" + zeroes + middle + "1";
    }
    
    public static String getOriginalKey(int n){
       String zeroes = "";
       for (int i = 0; i < n-2; i++){
           zeroes += "0";
       }
       return "1" + zeroes + "1";
    }
    
    public static int getjamCoin(String key){
           String divisorList = "";
           for (int i = 2; i <= 10; i++){
               //first get the value
               BigInteger baseValue = new BigInteger(key, i);//BigInteger.valueOf(Integer.parseInt(key, i));
               //then check if this is a prime
               BigInteger divisor = getDivisor(baseValue);
               //if it isn't, can go away.
               if (divisor == BigInteger.valueOf(-1)){
                   return 0;
               }
               //if it's ok, just add the divisor.
               divisorList = divisorList + " " + divisor;
           }
           // If it gets to this stage, that means it is a valid jamcoin. 
           System.out.println(key + " " + divisorList);
           return -1;
    }
    
    public static BigInteger getDivisor(BigInteger num){
        //If this take too long, skip
        
        
        BigInteger divisor = BigInteger.valueOf(-1);
        BigInteger i = BigInteger.valueOf(5);
        BigInteger w = BigInteger.valueOf(2);
        long lStartTime = System.nanoTime();
            while (i.multiply(i).compareTo(num) == -1){
                    if ((System.nanoTime() - lStartTime) / 1000000 > 50 ){
                        return  BigInteger.valueOf(-1);
                    }
                    if (num.mod(i) == BigInteger.valueOf(0)){
                        divisor = i;
                        return divisor;
                    }
                    i = i.add(w);
                    w = BigInteger.valueOf(6).subtract(w);               
            }    
       //     return divisor;
      //  long lEndTime = System.nanoTime();
      //  long difference = lEndTime - lStartTime;

	  //  System.out.println("Elapsed milliseconds: " + difference/1000000);
        return  BigInteger.valueOf(-1);
        
    }
}
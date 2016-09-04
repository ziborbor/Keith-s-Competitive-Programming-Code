import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
	    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		//int numberOfCases = in.nextInt();
		//int n = in.nextInt();
		//int j = in.nextInt();
        //Get the biggest

		int n = 3;
		int c = 2;
		int s = 2;
		//First, get all original sequence.
		int seqNum = (int)Math.pow(2,n);
		String[] originalSequeneces = getAllSeq(n, seqNum); 
        for (int i = 0; i < originalSequeneces.length;i++){System.out.println(originalSequeneces[i]);}
        
        //Next, get the tiles sequences
        String[] tileSequences = getAllTilesSeq(originalSequeneces, c);
        for (int i = 0; i < originalSequeneces.length;i++){System.out.println(tileSequences[i]);}
        
        //Then, 

    }
    
     public static String[] getAllTilesSeq(String[] originalSequences, int c){
       String[] seq = new String[originalSequences.length];
       for (int i = 0; i < originalSequences.length; i++){
			String tileSeq = getTileSeq(originalSequences[i], c);
            seq[i] = tileSeq;
       }
        return seq;
    }
    
     public static String getTileSeq(String origin, int c){
       String seq = origin;
       for (int i = 1; i < c; i++){
           String tempSeq = "";
           for (int j = 0; j < seq.length(); j++){
               if (seq.charAt(j)=='L'){
                   tempSeq += origin;
               } else {
                   for (int k = 0; k < origin.length(); k++){
                       tempSeq += "G";
                   }
               }               
           }
           seq = tempSeq;          
       }
      return seq;
    }
    
    
    
    
    
    
    public static String[] getAllSeq(int n, int num){
       String[] seq = new String[num];
       for (int i = 0; i < num; i++){
			String binary = Integer.toBinaryString(i);
			String seqBinary = binary + "";	
			String zeroes = "";
			for (int j = 0; j < n - seqBinary.length(); j++){
				zeroes += "0";
				}
			seqBinary = zeroes + seqBinary;
			seqBinary = convertToTiles(seqBinary);
            seq[i] = seqBinary;
       }
        return seq;
    }
    
    public static String convertToTiles(String seqBinary){
       String tiles = "";
       for (int i = 0; i < seqBinary.length(); i++){
           if (seqBinary.charAt(i)=='1')
               tiles += "L";
           else tiles += "G";
       }
       return tiles;
    }
    
    
   
}
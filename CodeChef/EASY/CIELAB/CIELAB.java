import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class CIELAB {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int change = a - b;
		int answer = 0;
		if (change < 1000) {
		answer = change + 1000;
		System.out.println(answer);
		}
		else {
			String changeString = change + "";
			int lastDigit = Integer.parseInt(changeString.charAt(3) + "");
			if (lastDigit == 9){
			answer = change - 1;
			} else{
			answer = change + 1;
			}
			System.out.println(answer);
		}
		
		s.close();
    }
}
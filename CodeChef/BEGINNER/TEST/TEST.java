import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class TEST {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
		while (s.hasNextInt()) {
			int num = s.nextInt();
			if (num == 42) break; 
			System.out.println(num);

		}
		s.close();
    }
}
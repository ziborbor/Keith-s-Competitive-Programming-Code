import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class GDOG {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int story = s.nextInt();
		for (int i = 0; i < story; i++){
			int coin = s.nextInt();
			int people = s.nextInt();
			int biggest = 0;
			for (int j = 1; j <= people; j++){
				if (coin%j > biggest) biggest = coin % j;
			}
			System.out.println(biggest);
		}
		
		
		s.close();
    }

}
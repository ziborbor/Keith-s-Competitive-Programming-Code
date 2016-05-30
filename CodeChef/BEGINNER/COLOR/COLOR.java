import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class COLOR {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int story = s.nextInt();
        for (int i = 0; i < story; i++){
			int wall = s.nextInt();
            String house = s.next();
			Map<Character, Integer> map = new HashMap<Character, Integer>();
            for (int j = 0; j< wall; j++){
                if (map.containsKey(house.charAt(j))) {
                    map.put(house.charAt(j), map.get(house.charAt(j))+ 1);
                } else {
				    map.put(house.charAt(j), 1);
                }
			}
            int biggest = 0;
			for (int wallExist : map.values()){
				if (biggest < wallExist)
                    biggest = wallExist;
			}
            System.out.println(wall - biggest);
        }
    }
}
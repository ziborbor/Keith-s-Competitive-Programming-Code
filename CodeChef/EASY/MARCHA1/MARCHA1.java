import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class MARCHA1 {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int story = s.nextInt();
		for (int i = 0; i < story; i++){
			int banknote = s.nextInt();
			int amount = s.nextInt();
			ArrayList<Integer> banknoteList = new ArrayList<Integer>();
			
			for (int j = 0; j < banknote; j++){
				int theNote = s.nextInt();
				//if (theNote < amount) {  
					banknoteList.add(theNote);				
			//	}				
			}
			encounter(banknoteList, amount);
		}
		
		
		s.close();
    }
	
	public static void encounter(ArrayList<Integer> banknoteList, int amount) {	
		for (int i = 0; i < Math.pow(2, banknoteList.size()); i++){
			String iBinary = Integer.toBinaryString(i);
			iBinary = String.format("%" + banknoteList.size()+ "s", iBinary).replace(' ', '0');
			int sum = 0;
			for (int j = 0; j < iBinary.length(); j++){				
				if (iBinary.charAt(j) == '1'){
					sum += banknoteList.get(j);				
				}				
			}
			if (sum == amount) {
			System.out.println("Yes");
			return;
			}		
		}
		System.out.println("No");

	}
}
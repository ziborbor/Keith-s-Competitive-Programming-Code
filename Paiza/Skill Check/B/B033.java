import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B033 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int column = Integer.parseInt(line);
		line = br.readLine();
		
		String[] columnName = line.split(" ");
		int row = Integer.parseInt(br.readLine());

		
		String[] rowDetail = new String[row];
		for (int i = 0; i < row; i++){
			 rowDetail[i] = br.readLine();
		}
		//Get the column's longest length
		int[] columnLongest = new int[column];
		for (int i = 0; i < column; i++){
			columnLongest[i] = getLongestLengthOfColumn(columnName[i], i, rowDetail);
		
		}

		//Then print the form out.
		//First Line
		String firstLine = "|";
		for (int i = 0; i < columnName.length; i++){
			firstLine = firstLine + getTheProperString(columnName[i], columnLongest[i]) + "|"; 
		}
		System.out.println(firstLine);
		//Second Line
		String secondLine = "|";
		for (int i = 0; i < columnName.length; i++){
			String secondLineDash = "";
			for (int j = 0; j < columnLongest[i] + 2; j++){
				secondLineDash += "-";
			}
			secondLine = secondLine + secondLineDash + "|"; 
		}
		System.out.println(secondLine);
		//The rest of the rows
		for (int i = 0; i < rowDetail.length; i++){
			String[] rowDetailArray = rowDetail[i].split(" ");
			String theRows = "|";
			for (int j = 0; j < rowDetailArray.length; j++){
				theRows += getTheProperString(rowDetailArray[j], columnLongest[j]) + "|";
			}
			System.out.println(theRows);
		
		}
		
		
		
		
    }
	
	public static int getLongestLengthOfColumn(String column, int columnIndex, String[] rowDetail){
		int longest = column.length();
		for (int i = 0; i < rowDetail.length; i++){
			String[] columnDetail = rowDetail[i].split(" ");
			if (columnDetail[columnIndex].length() > longest){
				longest = columnDetail[columnIndex].length();			
			}	
		}
		return longest;	
	}
	
	public static String getTheProperString(String input, int longest){
		String output = " " + input;
		int whiteSpaceToAdd = longest + 2 - output.length();
		for (int i = 0; i < whiteSpaceToAdd; i++){
			output += " ";
		}
		return output;
		
	
	
	}
}
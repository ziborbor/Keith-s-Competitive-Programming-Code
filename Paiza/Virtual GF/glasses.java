import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //get the 2 squares
        int mapSize = Integer.parseInt(line);
        int[][] map = new int[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++){
			line = br.readLine();
			String[] splitter = line.split(" ");
			for (int j = 0; j < splitter.length; j++){
				map[i][j] = Integer.parseInt(splitter[j]);
			}
		}
		int focusSize = Integer.parseInt(br.readLine());
        int [][] focus = new int[focusSize][focusSize];
        for (int i = 0; i < focusSize; i++){
			line = br.readLine();
			String[] splitter = line.split(" ");
			for (int j = 0; j < splitter.length; j++){
				focus[i][j] = Integer.parseInt(splitter[j]);
			}
		}
		
		
	/*	//print for check
		for (int i = 0; i < map.length;i++){
			for (int j = 0; j < map[i].length;j++){
			System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < focus.length;i++){
			for (int j = 0; j < focus[i].length;j++){
			System.out.print(focus[i][j]);
			}
			System.out.println();
		}
	*/	
		compare(map, focus);
    }
	
	public static void compare(int[][] map, int[][]focus) {
		int mapSize = map.length;
		int focusSize = focus.length;
		int checkPointX = 0;
		int checkPointY = 0;
		boolean match = true;
		for (int i = 0; i <= (mapSize - focusSize); i++){
		checkPointX = i;
		
			for (int j = 0; j <= (mapSize - focusSize); j++){
			    match = true;
				checkPointY = j;
				//make comparison
				for (int k = 0; k < focusSize; k++){
					for (int l = 0; l < focusSize; l++){
						if (focus[k][l] != map[i+k][j+l]) match = false;
					}
				}
				if (match) {
			System.out.print(checkPointX + " " + checkPointY);
			return;
			}
		
			}
		
		}
	
	
	
	
	
	
	
	}
}

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class yutaka {
   public static void main(String[] args) throws Exception {
        // �Է֤ε�������Z��
        // Let's �����󥸣���
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int story = Integer.parseInt(line);
        int cost = 0;
        int temp = 0;
        int[] timer = new int[story];
        String[] action = new String[story];
        for (int i = 0; i < story; i++){
            line = br.readLine();
            String[] split = line.split(" ");
            timer[i] = Integer.parseInt(split[0]);
            action[i] = split[1];
        }
        //get all information
        int counter = 0;
        for (int i = 0; i < 24; i++){
           if (temp > 0) {
             temp -= 1;
                }
                
            
            if (timer[counter] == i){
                if (action[counter].equals("in")){
                    temp += 5;
                } else {
                    temp += 3;
                }
                if (counter < story -1){
                    counter ++;
                }
            } 
            
                if (temp > 0){
                    cost += 2;
                } else cost += 1;
            
            
        }
        System.out.println(cost);
    }
}

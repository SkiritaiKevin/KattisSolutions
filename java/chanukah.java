import java.util.*;

public class chanukah {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int p = scnr.nextInt(); 
        for(int i = 0; i < p; i++){
            int k = scnr.nextInt(); 
            int n = scnr.nextInt();
            int candles = 0; 

            for(int j = 1; j < n + 1; j++){
                candles += j + 1; 
            }

            System.out.println(k + " " + candles);

        }

        scnr.close();
    }
}

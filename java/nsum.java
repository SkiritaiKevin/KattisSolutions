import java.util.*; 

public class nsum {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int n = scnr.nextInt(); 
        int sum = 0; 
        for(int i = 0; i < n; i++){
            sum += scnr.nextInt(); 
        }

        System.out.println(sum);

        scnr.close();
    }
}

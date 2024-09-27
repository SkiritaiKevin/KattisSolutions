import java.util.Scanner; 

public class pot {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int sum = 0; 

        int addends = scnr.nextInt(); 
        for(int i = 0; i < addends; i++){
            int n = scnr.nextInt(); 
            int power = n % 10; 

            int newN = (int)(n/10);
            sum += Math.pow(newN, power);  
        }

        System.out.println(sum);

        scnr.close(); 
    }
}

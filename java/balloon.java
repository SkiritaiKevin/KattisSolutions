import java.util.Scanner; 

public class balloon{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int inivelo = scnr.nextInt(); 
        int acc = scnr.nextInt(); 
        int time = scnr.nextInt(); 

        double distance = (inivelo * time) + (.5 * acc * Math.pow(time, 2)); 
        System.out.println(distance);

        scnr.close(); 
    }
}

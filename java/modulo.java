import java.util.Scanner;
import java.util.ArrayList;

public class modulo {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        ArrayList<Integer> distinctList = new ArrayList<>(); 

        for(int i = 0; i < 10; i++){
            int n = scnr.nextInt(); 
            if(distinctList.contains(n % 42)){
                continue; 
            }
            else{
                distinctList.add(n % 42); 
            }
        }

        System.out.println(distinctList.size());
        scnr.close(); 
    }
}

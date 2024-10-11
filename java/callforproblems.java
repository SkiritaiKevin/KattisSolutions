import java.util.*; 

public class callforproblems{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int count = 0;
        
        int probs = scnr.nextInt();
        for(int i = 0; i < probs; i++){
            if(scnr.nextInt() % 2 != 0){
                count++; 
            }
        }
        
        System.out.println(count); 
        
        scnr.close();
    }
}

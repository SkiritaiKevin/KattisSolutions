import java.util.*; 

public class cosmicpathoptimization{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        int m = scnr.nextInt(); 
        int total = 0; 
        
        for(int i = 0; i < m; i++){
            total += scnr.nextInt(); 
        }
        
        int avg = total / m; 
        System.out.println(avg); 
        
        scnr.close();
    }
}

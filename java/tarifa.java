import java.util.*; 

public class tarifa{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        int x = scnr.nextInt(); 
        int n = scnr.nextInt(); 
        int total = 0;
        int counter = 0; 
        
        for(int i = 0; i < n; i++){
            int j = scnr.nextInt(); 
            
            if (counter == 0){
                int fill = x - j; 
                total += fill + x; 
                counter++; 
            }
            else{
                total -= j; 
                total += x; 
            }
        }
        
        System.out.println(total); 
        
        
        scnr.close(); 
    }
}

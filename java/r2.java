import java.util.*; 

public class r2{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        int r = scnr.nextInt(); 
        int s = scnr.nextInt(); 
        
        int r2 = (s * 2) - r; 
        
        System.out.println(r2);
        
        scnr.close();
    }
}

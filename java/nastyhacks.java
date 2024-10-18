import java.util.*; 

public class nastyhacks{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        int n = scnr.nextInt();
        for(int i = 0; i < n; i++){
            int r = scnr.nextInt(); 
            int e = scnr.nextInt(); 
            int c = scnr.nextInt(); 
            if(r > (e - c)){
                System.out.println("do not advertise");
            }
            else if(r < (e - c)){
                System.out.println("advertise");
            }
            else{
                System.out.println("does not matter");
            }
        }
        
        scnr.close();
    }
}

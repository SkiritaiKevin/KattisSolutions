import java.util.*; 

public class fimmtudagstilbod{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        int y = scnr.nextInt();
        if(y < 2021){
            System.out.println(1000);
        } else{
            int diff = y - 2020; 
            System.out.println(1000 + (diff * 100)); 
        }
        
        scnr.close();
    }
}

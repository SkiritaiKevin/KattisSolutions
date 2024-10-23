import java.util.*; 

public class shandy {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int b = scnr.nextInt();
        int l = scnr.nextInt(); 

        int lower = Math.min(b, l); 
        System.out.println(lower * 2); 

        scnr.close();
    }
}

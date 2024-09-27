import java.util.Scanner; 

public class ashortcuttowhat {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int n = scnr.nextInt(); 
        n = (n+5)*3-10; 
        System.out.println(n);


        scnr.close();
    }
}

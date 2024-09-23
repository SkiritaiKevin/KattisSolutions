import java.util.Scanner; 

public class whichisgreater {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int a = scnr.nextInt();
        int b = scnr.nextInt(); 
        if(a > b){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

        scnr.close();
    }
}

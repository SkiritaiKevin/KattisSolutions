import java.util.Scanner; 

public class hipphipphurra {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        String name = scnr.next(); 
        int count = scnr.nextInt();

        for(int i = 0; i < count; i++){
            System.out.println("Hipp hipp hurra, " + name + "!"); 
        }

        scnr.close();
    }
}

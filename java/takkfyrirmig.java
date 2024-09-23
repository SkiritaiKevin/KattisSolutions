import java.util.Scanner; 

public class takkfyrirmig{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int guests = scnr.nextInt(); 
        for(int i=0; i < guests; i++){
            String name = scnr.next(); 
            System.out.println("Takk " + name);
        }

        scnr.close();
    }
}

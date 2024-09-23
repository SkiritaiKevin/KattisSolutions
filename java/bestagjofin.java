import java.util.Scanner; 

public class bestagjofin{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String name = "";
        int compare = 0; 

        int guests = scnr.nextInt(); 

        for(int i = 0; i < guests; i++){
            String nme = scnr.next();
            int level = scnr.nextInt();  
            if(level > compare){
                name = nme; 
                compare = level; 
            }
        }

        System.out.println(name);

        scnr.close();
    }
}

import java.util.*; 

public class fjoldibokstafa {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
    
        String n = scnr.next(); 
        int count = 0; 
        for(int i = 0; i < n.length(); i++){
            char x = n.charAt(i); 
            if(Character.isLetter(x)){
                count++; 
            } 
        }

        System.out.println(count);

        scnr.close();
    }
}

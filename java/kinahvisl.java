import java.util.*; 

public class kinahvisl{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        String word = scnr.next();
        String nWord = scnr.next();
        int count = 0; 
        
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) != nWord.charAt(i)){
                count++; 
            }
        }
        
        System.out.println(count + 1); 
        scnr.close();
    }
}

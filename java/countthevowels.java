import java.util.*;

public class countthevowels {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        ArrayList<Character> vowels = new ArrayList<Character>();
        int count = 0; 

        vowels.add('a');
        vowels.add('e'); 
        vowels.add('i'); 
        vowels.add('o'); 
        vowels.add('u'); 
        
        String s = scnr.nextLine(); 
        String ss = s.toLowerCase(); 

        for(int i = 0; i < ss.length(); i++){
            if(vowels.contains(ss.charAt(i))){
                count++; 
            }
        }

        System.out.println(count);
        scnr.close();
    }
}

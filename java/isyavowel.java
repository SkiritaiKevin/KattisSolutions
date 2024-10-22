package solve; 

import java.util.*; 

public class isyavowel{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        ArrayList<Character> vowels = new ArrayList<Character>(); 
        vowels.add('a'); 
        vowels.add('e'); 
        vowels.add('i'); 
        vowels.add('o'); 
        vowels.add('u');
        vowels.add('y');  

        String n = scnr.next();
        int count = 0; 
        int yCount = 0; 

        for(int i = 0; i < n.length(); i++){
            if(vowels.contains(n.charAt(i))){
                count++; 
                if(n.charAt(i) == 'y'){
                    yCount++; 
                }
            }
        }

        System.out.println(count-yCount + " " + count);

        scnr.close();
    }
}

import java.util.Scanner;

public class hissingmicrophone {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        int count = 0; 

        String word = scnr.next(); 
        for(int i = 0; i < word.length() - 1; i++){
                if(word.charAt(i) == 's' && word.charAt(i+1) == 's'){
                    System.out.println("hiss");
                    count++; 
                    break;
                } 
            }

        if(count == 0){
            System.out.println("no hiss");
        }
        scnr.close();
    }

}

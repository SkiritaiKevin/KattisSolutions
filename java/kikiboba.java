import java.util.*;

public class kikiboba {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        // b > k boba
        // k > b kiki
        // b = k boki
        // no b, no k none
        int b = 0; 
        int k = 0; 

        String word = scnr.next();
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'b'){
                b++; 
            }
            else if(word.charAt(i) == 'k'){
                k++;
            }
        }

        if(b > k){
            System.out.println("boba");
        }
        else if(k > b){
            System.out.println("kiki");
        }
        else if(b == 0 && k == 0){
            System.out.println("none");
        }
        else{
            System.out.println("boki");
        }
        scnr.close();
    }
}

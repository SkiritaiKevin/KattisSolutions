import java.util.*;

public class keysphonewallet {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        ArrayList<String> items = new ArrayList<String>(); 
        int count = 0; 

        int n = scnr.nextInt();
        scnr.nextLine(); 
        for(int i = 0; i < n; i++){
            String x = scnr.nextLine(); 
            if(x.equals("keys") || x.equals("phone") || x.equals("wallet")){
                items.add(x); 
                count++; 
            }
        }

        if(count == 3){
            System.out.println("ready");
        } else{
            if(!items.contains("keys")){
                System.out.println("keys");
            }
            if(!items.contains("phone")){
                System.out.println("phone");
            }
            if(!items.contains("wallet")){
                System.out.println("wallet");
            }
        }

        scnr.close();
    }
}

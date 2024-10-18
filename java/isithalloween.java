import java.util.*; 

public class isithalloween{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        String month = scnr.next(); 
        int day = scnr.nextInt();
        
        if(month.equals("OCT")){
            if(day == 31){
                System.out.println("yup");
            }
            else{
                System.out.println("nope");
            }
        }
        else if(month.equals("DEC")){
            if(day == 25){
                System.out.println("yup");
            }
            else{
                System.out.println("nope"); 
            }
        }
        else{
            System.out.println("nope");
        }
        
        scnr.close();
    }
}

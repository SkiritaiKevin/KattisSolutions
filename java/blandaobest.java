import java.util.Scanner; 

public class blandaobest {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int meats = scnr.nextInt(); 
        scnr.nextLine();
        int k = 0; 
        int n = 0; 
        String placeholder1 = "kjuklingur"; 
        String placeholder2 = "nautakjot"; 
        for(int i = 0; i < meats; i++){
            String nameM = scnr.nextLine(); 
            if(nameM.equals(placeholder1)){
                k++; 
            }
            else{
                n++;
            }
        }

        if(k >= 1 && n >= 1){
            System.out.println("blandad best");
        }
        else if(k >= 1){
            System.out.println(placeholder1);
        }
        else{
            System.out.println(placeholder2);
        }
        
        scnr.close();
    }
}

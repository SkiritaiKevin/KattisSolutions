import java.util.*;

public class vedurheidar{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        int wind = scnr.nextInt(); 
        int roads = scnr.nextInt(); 
        for(int i = 0; i < roads; i++){
            String road = scnr.next(); 
            int max = scnr.nextInt(); 

            if(wind > max){
                System.out.println(road + " lokud");
            }
            else{
                System.out.println(road + " opin");
            }
        }

        scnr.close(); 
    }
}

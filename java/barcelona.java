import java.util.*;

public class barcelona {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        //ArrayList<Integer> list = new ArrayList<>(); 

        int bags = scnr.nextInt();
        int benni = scnr.nextInt(); 
        int count = 0; 
    
        for(int i = 0; i < bags; i++){
            //list.add(scnr.nextInt()); 
            if(scnr.nextInt() == benni){
                count++; 
                break; 
            }
            count++; 
        }

        if(count == 1){
            System.out.println("fyrst");
        }
        else if(count == 2){
            System.out.println("naestfyrst");
        }
        else{
            System.out.println(count + " fyrst");
        }


        scnr.close();
    }
}

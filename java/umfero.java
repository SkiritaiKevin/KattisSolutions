import java.util.Scanner; 

public class umfero {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int totalCount = 0; 
        int emptyCount = 0; 

        int cells = scnr.nextInt(); 
        int lanes = scnr.nextInt(); 
        for(int i = 0; i < lanes; i++){
            String identifier = scnr.next(); 
            for(int j = 0; j < cells; j++){
                if(identifier.charAt(j) == '.'){
                    emptyCount++; 
                }
                totalCount++; 
            }
        }
        System.out.println((double) emptyCount/totalCount);

        

        scnr.close();
    }
}

import java.util.*; 

public class hakkari{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        // . = no mine
        // * = mine
        int lines = scnr.nextInt();
        int chars = scnr.nextInt();
        int mines = 0; 

        List<String> positions = new ArrayList<>(); 

        for(int i = 0; i < lines; i++){
            String mineDEF = scnr.next(); 
            for(int j = 0; j < chars; j++){
                if(mineDEF.charAt(j) == '*'){
                    mines++; 
                    positions.add((i+1) + " " + (j+1)); 
                }
            }
        }
        System.out.println(mines);

        for(String pos : positions){
            System.out.println(pos);
        }

        scnr.close();
    }
}

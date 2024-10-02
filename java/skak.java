import java.util.Scanner; 

public class skak {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 
        
        // garoar has pawn
        // petra has rook
        int rookX = scnr.nextInt();
        int rookY = scnr.nextInt();
        int pawnX = scnr.nextInt(); 
        int pawnY = scnr.nextInt(); 

        if(rookX == pawnX || rookY == pawnY){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }

        scnr.close(); 
    }
}

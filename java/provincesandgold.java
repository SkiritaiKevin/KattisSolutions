import java.util.Scanner; 

public class provincesandgold {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int golds = scnr.nextInt();
        int silvers = scnr.nextInt(); 
        int coppers = scnr.nextInt(); 

        int totalBuy = 0; 

        totalBuy += golds * 3 + silvers * 2 + coppers * 1; 
        if(totalBuy >= 8){
            System.out.println("Province or Gold");
        }
        else if(totalBuy > 5){
            System.out.println("Duchy or Gold");
        }
        else if(totalBuy >= 5){
            System.out.println("Duchy or Silver");
        }
        else if(totalBuy > 2){
            System.out.println("Estate or Silver");
        }
        else if(totalBuy >= 2){
            System.out.println("Estate or Copper");
        }
        else{
            System.out.println("Copper");
        }

        scnr.close(); 
    }
}

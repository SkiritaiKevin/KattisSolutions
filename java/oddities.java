import java.util.Scanner; 

public class oddities {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt(); 

        for(int i = 0; i < n; i++){
            int num = scnr.nextInt();
            if(num % 2 == 0){
                System.out.println(num + " is even");
            }
            else{
                System.out.println(num + " is odd");
            }
        }

        scnr.close();
    }
}

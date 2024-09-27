import java.util.Scanner; 

public class trianglearea {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in); 

        int height = scnr.nextInt(); 
        int base = scnr.nextInt(); 

        double area = (double) .5 * height * base; 
        System.out.println(area);

        scnr.close();
    }
}

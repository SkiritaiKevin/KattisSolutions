import java.util.Scanner; 

public class leynibjonusta {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String str = scnr.nextLine();
        String newStr = str.replaceAll("\\s", ""); 
        System.out.println(newStr);

        scnr.close();
    }
}

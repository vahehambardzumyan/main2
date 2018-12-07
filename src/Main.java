
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean negative = scanner.nextBoolean();
        System.out.println(posNeg(a, b, negative));


    }
    public static boolean posNeg(int a, int b, boolean negative) {
        if (a>0 && b>0){
            return false;
        }else if(a>0 && b<0) {
            return true;
        }else if(a<0 && b>0) {
            return true;
        } else if(a<0 && b <0 && negative) {
            return true;
        } return false;

}


}
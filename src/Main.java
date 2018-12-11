import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter word");
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine();
        int n= scanner.nextInt();
        String test=missingChar( str,  n);
        System.out.println(test);
    }
    public  static  String   missingChar(String   str,   int   n)  {
       String a = str.substring(0,n);
       String b = str.substring(n+1,str.length());
            return  a+b;
        }
    }



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N%2!=0) || (N%2==0 && N==6 || N==7 || N==8 || N==9 || N==10|| N==11|| N==12 || N==13 || N==14 || N==15 ||N==16 ||N==17 ||N==18 || N==19 || N==20))
        {
            System.out.println("Weird");
        }
        else
        {
            if((N>20)||(N%2==0 && N==2 || N==3 || N==4 || N==5))
            System.out.println("Not Weird");
        }
           

        scanner.close();
    }
}

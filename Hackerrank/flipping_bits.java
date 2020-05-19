import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static long flippingBits(long n) {

        StringBuilder s = new StringBuilder("");
        s.append(Long.toBinaryString(n));
        s = s.reverse();
        while(s.length()<32){
            s.append(0);
        }
        s = s.reverse();
        StringBuilder s2 = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                s2.append(1);
            }
            else{
                s2.append(0);
            }
        }
        long res = 0;
        for(int i=0,j=s2.length()-1;i<s2.length();i++,j--){
            if(s2.charAt(j)=='1'){
                res += Math.pow(2,i);
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

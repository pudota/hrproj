package intq;


import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'getMinimumOperationCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int getMinimumOperationCount(String s) {
        // Write your code here - er
        String str = s;
        int[] result = new int[s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int count = 0;
            char[] chars = s.toCharArray();
            int cc = 1;
            for (int j = 1; j < chars.length; j++) {
                if (chars[j] == chars[j - 1]) {
                    cc++;
                    if (j == chars.length - 1) {
                        count = count + cc / 2;
                    }
                } else {
                    count = count + cc / 2;
                    cc = 1;
                }
                result[i] = count;
            }
            return n;
        }
    }
}


    public class GoDaddySol {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            int result = Result.getMinimumOperationCount(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
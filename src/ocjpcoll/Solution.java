package ocjpcoll;

/*


Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, N , print its first 10 multiples. Each multiple Nxi (where 1<_i<_10 ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints
2<_N<_20
Output Format

Print 10 lines of output; each line i(where 1<_i<_10) contains the result of N x i in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20


*/

import java.util.Scanner;

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

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N >=2 || N <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(+N + " x " + i + " = " + N * i);
            }
        }
        bufferedReader.close();

    }
}



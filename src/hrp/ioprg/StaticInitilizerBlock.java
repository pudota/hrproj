package hrp.ioprg;

/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

Input Format

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

Constraints
-100<=B<=100
-100<=H<=100

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*/

import java.util.Scanner;

public class StaticInitilizerBlock {
    static Scanner scanner = new Scanner(System.in);
    static int B=scanner.nextInt();
    static int H=scanner.nextInt();
    static boolean flag=false;

static {
    try{
        if(B<=0 || H<=0>) {
            flag=false;
            throw new Exception("Beadth and Height must be positive");
        }

    }
    catch (Exception e) {
System.out.println("exception-->"+e);
    }
}
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}





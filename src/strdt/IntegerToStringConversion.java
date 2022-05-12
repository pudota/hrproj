package strdt;

/*You are given an integer , you have to convert it into a string.

        Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

        can range between -100 to 100 inclusive.*/

import java.util.Scanner;

public class IntegerToStringConversion {
public static  void main(String[] args) {
    try {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String number = Integer.toString(num);
        System.out.println("Enter Number"+number);
        if (num > -100 || num < 100) {
            if (num == Integer.parseInt(number)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        }
        else{
            System.out.println("Wrong Input");
        }
    }
    catch(Exception e){
        System.out.println("Wrong answer." + e);
    }

}

}
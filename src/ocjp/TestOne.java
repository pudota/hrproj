package ocjp;

import java.text.NumberFormat;

public class TestOne {
    public static void main(String[] args) throws Exception {
        Thread.sleep(3000);
        System.out.println("Sleep");

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(4);
        nf.setMinimumFractionDigits(2);
        String a = nf.format(3.14159265656);
        String b = nf.format(2);
        System.out.println(a);
        System.out.println(b);

    }


}

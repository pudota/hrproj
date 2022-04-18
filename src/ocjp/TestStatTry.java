package ocjp;

public class TestStatTry {
    static void testStatTry() {
        try {
            String x=null;
            System.out.println(x.toString()+ "");

        } finally {
            System.out.println("finally");

        }
    }

    public static void main(String[] args) {
        try {
            //System.out.println("false");
testStatTry();
        } catch (Exception ex) {
            System.out.println("Exception");

        }
    }
}

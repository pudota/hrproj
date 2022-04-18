package ocjp;

public class TestIf {

    public static void main(String[] args) {
        new TestIf().testIfA();

    }

    public void testIfA() {
        if(testIfB("true"))
            System.out.println("true");
        else
            System.out.println("false");

    }

    public Boolean testIfB(String str) {
        return Boolean.valueOf(str);
    }
}

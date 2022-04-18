package ocjp;

public class Test {
    public static void main(String[] args) {
        try{
            args=null;
            args[0]="Exception";
            System.out.println("args[0]" +args);

        }
        catch (NullPointerException npe){
            System.out.println("NullPointerException" +npe);
        }
        catch (Exception ex){
            System.out.println("Exception" +ex);
        }

    }
}


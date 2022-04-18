package ocjp;

public class Venus {
    public static void main(String[] args) {
        int[] x={1,2,3};
        int[] y={3,4,5};
        new Venus().go(x,y);
    }

        void go(int[]...z) {
    for(int[]a:z)
            System.out.println(a[0]);
        }
    }


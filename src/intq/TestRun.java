package intq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestRun {

    public static void main(String[] args) {
        List<Integer> alist=new ArrayList<Integer>();
        alist.add(23);
        alist.add(8);
        alist.add(9);
        alist.add(10);
        alist.add(4);
 /*       alist.add("");
        alist.add("9");
        alist.add("10");
        alist.add("4");*/
System.out.println("Array Before sort:"+alist);

        List<Integer> sortedAlist=alist.stream().sorted().collect(Collectors.toList());
        System.out.println("Array Before sort:"+sortedAlist);

/*
alist.stream().sorted(collect(Collectors.toList());
*/
//System.out.println();
    }
}

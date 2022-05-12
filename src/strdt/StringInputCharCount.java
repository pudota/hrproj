package strdt;

public class StringInputCharCount {


    public static void main(String[] args) {
           /* ArrayList<String> strings = new ArrayList<String>();
            strings.add("Hello, World!");
            strings.add("Welcome to CoderPad.");
            strings.add("This pad is running Java " + Runtime.version().feature());
            String input="aaabbcddddda";
            int counter=1;
            StringBuilder output=new StringBuilder();
            for(int i=1;i<input.length();i++) {
                if(input.charAt(i)==input.charAt(i-1)) {
                    counter++;
                }
                else {

                    System.out.println(counter+ "" + input.charAt(input.length()-1));
                    output.append(input.charAt(input.length()-1)).append(counter>1?counter: "");
                    System.out.println("output = " +output.toString());
                }
            }*/

        String a = "aaabbccccd";
        int currentLength = 1;

        StringBuilder result = new StringBuilder(); // empty string
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == a.charAt(i - 1)) {
                currentLength++;
            } else {
                System.out.println(currentLength + "" + a.charAt(i - 1));
                result.append(a.charAt(i - 1))
                        .append(currentLength > 1 ? currentLength : "");
                currentLength = 1; // reset the length
            }
        }

        // print last one
        System.out.println(currentLength + "" + a.charAt(a.length() - 1));
        result.append(a.charAt(a.length() - 1))
                .append(currentLength > 1 ? currentLength : "");
        System.out.println("result = " + result.toString());

    }
}
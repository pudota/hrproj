package dataalgs;

import java.util.*;

public class DuplicateCharsInWord {

    public static void main(String[] args) {
        System.out.println("Finding duplicates in a String" );
        String word="Code Decode";
        System.out.println("Word : "+word );

        String dupWord="Code Decode";
        dupWord= String.valueOf(findDuplicatesUsingFor(word));
        System.out.println("Finding duplicates in a String: " +dupWord);
        dupWord= String.valueOf(findDuplicatesUsingArrays(word));
        System.out.println("Finding duplicates in a String: " +dupWord);
        dupWord= String.valueOf(findDuplicatesUsingMap(word));
        System.out.println("Finding duplicates in a String: " +dupWord);
    }

    //time complexity for findDuplicatesUsingFor is 0(n)
    private static Set<Character> findDuplicatesUsingMap(String word) {
        Set<Character> duplicates = new LinkedHashSet<>();
        HashMap<Character, Integer> countMap= new HashMap<Character, Integer>();
        for(int i=0; i<word.length(); i++) {
            if(countMap.containsKey(word.charAt(i))) {
                countMap.put(word.charAt(i),countMap.get(word.charAt(i))+1);
            } else {
                countMap.put(word.charAt(i),1);
            }

        }
        for(Map.Entry<Character, Integer> entry: countMap.entrySet()) {
            if(entry.getValue() >1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    //time complexity for findDuplicatesUsingFor is 0(n2)
    private static Collection<Character> findDuplicatesUsingFor(String word) {
        Set<Character> duplicates= new LinkedHashSet<>();
        for(int i=0; i<word.length(); i++) {
            for (int j=i+1; j<word.length();j++) {
                duplicates.add(word.charAt(j));
            }
        }
      return duplicates;
    }

    //space complexity for findDuplicatesUsingArrays is 0(n)
    private static Set<Character> findDuplicatesUsingArrays(String word) {
    Set<Character> duplicates=new LinkedHashSet<>();

    int[] arrayforChar=new int[255];
    for(int i=0; i<word.length(); i++) {
        arrayforChar[word.charAt(i)] = arrayforChar[word.charAt(i)]+1;

    }
        for(int i=0; i<256; i++) {
            if(arrayforChar[i]>1){
                duplicates.add((char) i);
            }
        }
        return duplicates;
    }


}

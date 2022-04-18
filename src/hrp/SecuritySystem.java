package hrp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class SecuritySystem {

    public static void main(String[] args) {
         /*
    We are working on a security system for a badged-access room.
    Given an ordered list of employees who used their badge to enter or exit the room,
 write a function that returns two collections:
    1. All employees who didn't use their badge while exiting the room - they recorded an enter without a matching exit.
    2. All employees who didn't use their badge while entering the room - they recorded an exit without a matching enter.
    * */

          /*  String[][] records = {{"Marthaha", "enter"},
                    {"Martha","exit"},{"Paul","enter"},
                    {"Martha","enter"},{"Martha","exit"},
                    {"Jennifer","enter"},{"Paul","enter"},
                    {"Curtis","enter"},{"Paul","exit"},
                    {"Martha","enter"},{"Martha","exit"},
                    {"Jennifer","exit"}
            };*/
            String[][] badge_records = {
                    {"Paul", "1335"},{"Jennifer", "1910"},
                    {"John", "830"},{"Paul","1315"},
                    {"John", "835"},{"Paul", "1405"},
                    {"Paul", "1630"},{"John","855"},
                    {"John", "915"},{"John", "930"},
                    {"Jennifer", "1335"},{"Jennifer", "730"},
                    {"John", "1630"}
            };
        System.out.println(" badge records"+badge_records);

        //  find_mismatched(records);
            find(badge_records);
        }

    public static void find(String[][] records){
        // step 1
        Map<String, List<Integer>> map = new HashMap<>();
        System.out.println("find badge records"+records);
        for(String[] record : records){
            String person = record[0];
            int time = Integer.parseInt(record[1]);
            map.putIfAbsent(person, new ArrayList<>());
            map.get(person).add(time);
        }
        // step 2：
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
            // helper function to find a person's 1-hour period
            List<Integer> times = entry.getValue();
            Collections.sort(times);
            int[] index = helper(times);
            if(index[0]!=-1){
                List<Integer> timesInHour = new ArrayList<>();
                for(int i = index[0]; i <= index[1]; i++) timesInHour.add(times.get(i));
                System.out.println(entry.getKey() + ": " + timesInHour);
            }
        }
    }
    private static int[] helper(List<Integer> list){
        // to store left pointer's index and right pointer's index
        int[] index = new int[2];
        // use two pointers
        int left = 0;
        int right = 0;
        for(; right < list.size(); right++){
            while(list.get(right) - list.get(left) > 100){
                left ++;
            }
            // now right pointer and left pointer are in the 1 hour period
            // when right index - left index >= 2, find a valid hour.
            // at this time, move right to find valid times in that period as much as possible
            //return
            if(right - left >= 2){
                while(right < list.size() && list.get(right) - list.get(left) <= 100) right ++;
                return new int[]{left, right-1};
            }
        }
        //don't find a valid hour
        return new int[]{-1,-1};
    }

    }

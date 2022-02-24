// 1st try

import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("helloworld");
        
        String s = "abcdefghijklmnopqrstuvwxyz";
        
        int[] bucket = new int[26];
        for (int i = 0; i < s.length(); i++) {
            bucket[s.charAt(i)-'a']++;
        }
        
        int curMax = -1;
        
        Map<Character, Integer> map = new HashMap<>();
        
        int index = -1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 26; j++) {
                if (bucket[j] > curMax) {
                    curMax = bucket[j];
                    index = j;
                }
            }
            char c = (char)('a'+index);
            map.put(c, 1);
            bucket[index] = -1;
            curMax = -1;
            index = -1;
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 26; j++) {
                if (bucket[j] > curMax) {
                    curMax = bucket[j];
                    index = j;
                } 
            }
            char c = (char)('a'+index);
            map.put(c, 2);
            bucket[index] = -1;
            curMax = -1;
            index = -1;
        }
        
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                res += map.get(s.charAt(i));
                System.out.println("res count: " + res + ", char is + "+ s.charAt(i));
            } else {
                res += 3;
                System.out.println("res count: " + res + ", char is + "+ s.charAt(i));
            }
        }
        System.out.print("Total press count is : " + res);
     }
}

import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        String s = "abcabc";
        int k = 3;
        
        Set<String> set = new HashSet<>();
        int[] bucket = new int[26];
        
        int start = 0;
        int end = 0;
        
        while (start <= end && end < s.length()) {
            bucket[s.charAt(end)-'a']++;
            
            while (bucket[s.charAt(end)-'a'] != 1) {
                bucket[s.charAt(start)-'a']--;
                start++;
            }
            
            if (end - start + 1 == k) {
                set.add(s.substring(start, end+1));
                bucket[s.charAt(start)-'a']--;
                start++;
            }
            end++;
        }
        
        System.out.print(set);
     }
}

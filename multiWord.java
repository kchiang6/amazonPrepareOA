public class HelloWorld{

     public static void main(String []args){
         
         String s1 = "monmonmmmmmonnnnn";
         String s2 = "mon";
         
         int[] s1Counter = new int[26];
         int[] s2Counter = new int[26];
         
         for (int i = 0 ; i < s1.length(); i++) {
             s1Counter[s1.charAt(i)-'a']++;
         }
         for (int i = 0; i < s2.length(); i++) {
             s2Counter[s2.charAt(i)-'a']++;
         }
         
         int min = Integer.MAX_VALUE;
         for (int i = 0; i < 26; i++) {
             if (s2Counter[i] != 0) {
                 min = Math.min(min, s1Counter[i]/s2Counter[i]);
             }
         }

        System.out.println("you can repear : " + min);
     }
}

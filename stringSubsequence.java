public class HelloWorld{

     public static void main(String []args){
         
         String s1 = "mazon";
         String s2 = "amazon";
         
         int len1 = s1.length();
         int len2 = s2.length();
         
         int p = 0;
         int q = 0;
         
         while (p < len1) {
             char c1 = s1.charAt(p);
             char c2 = s2.charAt(q);
             
             if (c1 == c2) {
                 p++;
                 q++;
             } else {
                 p++;
             }
         }
         
         int diff = len2 - q;
         
        System.out.println("the different is : " + diff);
     }
}

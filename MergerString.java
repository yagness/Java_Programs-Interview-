public class MergerString {

    public static void main(String args[])
    {
        String ans = mergeAlternately("abc","defgh");
        System.out.println(ans);
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergerString = new StringBuilder();
        int i=0,j=0;
        
        //append string alternately
          while(i<word1.length() && j<word2.length())
          {
            //char a = word1.charAt(i);
            //mergerString.append(a);
            //i++;
            mergerString.append(word1.charAt(i++));
            mergerString.append(word2.charAt(j++));
          } 

          //Rest all character add of word1 at last
          while(i<word1.length())
          {
            mergerString.append(word1.charAt(i++));
          }

          //rest all character add of word2 at last
          while(j<word2.length())
          {
            mergerString.append(word2.charAt(j++));
          }
          return mergerString.toString();
    }
}
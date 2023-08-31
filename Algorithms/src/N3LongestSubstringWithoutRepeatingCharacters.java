//Given a string s, find the length of the longest substring without repeating characters.

public class N3LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int temp = 1;
        for(int i=0; i<s.length(); i++){
            String str = s.substring(i,i+1);

            for(int j=i+1; j<s.length(); j++){
               if(str.contains(s.substring(j,j+1))){
                   j = s.length() + 1;
               }
               else{
                   temp++;
                   str += s.substring(j,j+1);
               }
            }

            if(temp>length){
                length = temp;
            }

            temp = 1;
        }

        return length;
    }

    public static void main (String[] args){
        String str1 = "abcabcbb";
        String str2 = "bbbbb";
        String str3 = "pwwkew";
        String str4 = " ";
        String str5 = "au";

        System.out.println(lengthOfLongestSubstring(str1));
        System.out.println(lengthOfLongestSubstring(str2));
        System.out.println(lengthOfLongestSubstring(str3));
        System.out.println(lengthOfLongestSubstring(str4));
        System.out.println(lengthOfLongestSubstring(str5));
    }
}

//Given a string s, return the longest palindromic substring in s

public class N0005LongestPalidromicSubstring {
    public static String longestPalindrome(String s) {
        String nstr = "";
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length()+1; j++){
                String temp = s.substring(i,j);
                if(temp.equals(reverse(s.substring(i,j)))){
                    if(temp.length()>nstr.length()){
                        nstr = temp;
                    }
                }
            }
        }

        return nstr;
    }

    public static String reverse (String s){
        char ch;
        String nstr = "";
        for (int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        return nstr;
    }

    public static void main (String[] args){
        String s1 = "babad";
        String s2 = "cbbd";
        String s3 = "abbcaaaacdef";
        String s4 = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendu" +
                "reWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafi" +
                "nalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangand" +
                "properthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothall" +
                "owthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorpon" +
                "wertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverfo" +
                "rgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichthe" +
                "ywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafsk" +
                "remainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheyg" +
                "avethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinva" +
                "inthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeo" +
                "pleforthepeopleshallnotperishfromtheearth";

        System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
        System.out.println(longestPalindrome(s3));
        System.out.println(longestPalindrome(s4));
    }
}

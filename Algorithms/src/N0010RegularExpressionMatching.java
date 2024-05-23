/*
Given an input string s and a pattern p,
implement regular expression matching with support for '.' and '*' where:

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

Runtime: 2 ms, faster than 65.87% of Java online submissions for Regular Expression Matching.
Memory Usage: 41.8 MB, less than 81.64% of Java online submissions for Regular Expression Matching.

Note to Self: Review this solution again sometime
 */

public class N0010RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        if (p == null || p.length() == 0) return (s == null || s.length() == 0);

        boolean[][] arr = new boolean[s.length()+1][p.length()+1];
        arr[0][0] = true;

        for(int i=2; i<p.length() + 1; i++){
            arr[0][i] = p.charAt(i-1) == '*' && arr[0][i-2];
        }

        for(int j=1; j<p.length()+1; j++){
            for(int k=1; k<s.length()+1; k++){
                if(p.charAt(j-1) == s.charAt(k-1) || p.charAt(j-1) == '.') {
                    arr[k][j] = arr[k-1][j-1];
                }

                else if(p.charAt(j-1) == '*'){
                    arr[k][j] = arr[k][j-2]
                            || ((s.charAt(k-1) == p.charAt(j-2)
                            || p.charAt(j-2) == '.') && arr[k-1][j]);
                }
            }
        }

        return arr[s.length()][p.length()];
    }

    public static void main (String[] args){
        String s1 = "aa";
        String p1 = "a";

        String s2 = "aa";
        String p2 = "a*";

        String s3 = "ab";
        String p3 = ".*";

        String s4 = "aab";
        String p4 = "c*a*b";

        String s5 = "acab";
        String p5 = ".*";

        System.out.println(isMatch(s1, p1));
        System.out.println(isMatch(s2, p2));
        System.out.println(isMatch(s3, p3));
        System.out.println(isMatch(s4, p4));
        System.out.println(isMatch(s5, p5));
    }
}

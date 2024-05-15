/*
Writes a string in a zigzag given the number of rows and then creates a new string with the pattern
(to see this in action you can uncomment the commented out code)
Runtime: 106 ms, faster than 5.04% of Java online submissions for Zigzag Conversion.
Memory Usage: 53.3 MB, less than 5.23% of Java online submissions for Zigzag Conversion.
Note to self: rewrite a better version
 */

import java.util.ArrayList;

public class N0006ZigzagConversion {
    public static String convert(String s, int numRows) {
        String newStr = "";
        ArrayList<ArrayList<String>> zig = new ArrayList<ArrayList<String>>();
        int col = 0;

        while(s.length()>0){
            ArrayList<String> zag = new ArrayList<String>();
            for(int i=0; i<numRows; i++){
                if(numRows == 1 || col % (numRows - 1) == 0 && s.length()>0){
                    zag.add(s.substring(0,1));
                    if(s.length()>1) {
                        s = s.substring(1);
                    }
                    else{
                        s = "";
                    }
                }

                else if(col % (numRows - 1) == numRows - i - 1 && s.length()>0){
                    zag.add(s.substring(0,1));
                    if(s.length()>1) {
                        s = s.substring(1);
                    }
                    else{
                        s = "";
                    }
                }

                else {
                    zag.add("");
                }
            }
            /*
            for (int m=0; m<numRows; m++){
                System.out.print(zag.get(m));
            }
            System.out.println("");
             */
            col++;
            zig.add(zag);
        }

        for(int i=0; i<zig.get(0).size(); i++){
            for(int j=0; j<zig.size(); j++){
                newStr += zig.get(j).get(i);
            }
        }
        return newStr;
    }

    public static void main(String[] args){
        String t1 = "PAYPALISHIRING";
        String t2 = "A";

        System.out.println(convert(t1, 3));
        System.out.println(convert(t1, 4));
        System.out.println(convert(t2, 1));
    }
}

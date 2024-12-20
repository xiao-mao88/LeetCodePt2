public class N00012IntegerToRoman {
  public static String romanNum(int num) {
    String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String[] hrns = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String[] ths ={"","M","MM","MMM"};

    return String.valueOf(ths[num / 1000]) +
            hrns[(num % 1000) / 100] +
            tens[(num % 100) / 10] +
            ones[num % 10];
  }

  public static void main (String[] args) {
    int test1 = 3749;
    int test2 = 58;
    int test3 = 1994;

    System.out.println(romanNum(test1));
    System.out.println(romanNum(test2));
    System.out.println(romanNum(test3));
  }
    
}
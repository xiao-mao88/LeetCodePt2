import java.util.ArrayList;
import java.util.List;

public class N0022GenerateParentheses {


  public List<String> generateParenthesis(int n) {
    List<String> res = new ArrayList<>();
    parenthesis(0, 0, n, "", res);
    return res;
  }

  private void parenthesis(int left, int right, int n, String s, List<String> res) {
    if (s.length() == n * 2) {
      res.add(s);
      return;
    }
    if (left < n) {
      parenthesis(left + 1, right, n, s + ")", res);
    }
    if (right > left) {
      parenthesis(left, right + 1, n, s + "(", res);
    }
  }
}

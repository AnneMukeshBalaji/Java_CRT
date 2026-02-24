package TwoPointers;

public class ValidPalindrome {
  // NOTE: Leetcode number 125
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = s.replaceAll("[^a-z0-9]", "");
    int end = s.length() - 1;
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(end)) {
        return false;
      }
      end -= 1;
    }

    return true;
  }
}

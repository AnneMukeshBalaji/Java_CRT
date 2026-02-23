package Day5;

public class Anagram {
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] alphabet = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char charInS = s.charAt(i);
      char charInT = t.charAt(i);
      alphabet[charInS - 'a']++;
      alphabet[charInT - 'a']--;
    }
    for (int i = 0; i < alphabet.length; i++) {
      if (alphabet[i] != 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "aba";
    String t = "baa";
    Anagram obj = new Anagram();
    System.out.println(obj.isAnagram(s, t));
  }
}

package TwoPointers;

public class TwoSum2 {
  // NOTE: Leetcode Problem Number 167
  public int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[start] + numbers[end] == target) {
        index1 = start + 1;
        index2 = end + 1;
      } else if (numbers[start] + numbers[end] > target) {
        end = end - 1;
      } else {
        start = start + 1;
      }
    }
    // int [] arr = new int[2];
    // arr[0] = index1;
    // arr[1] = index2;
    return new int[] { index1, index2 };
  }
}

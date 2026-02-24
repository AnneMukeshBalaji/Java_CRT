package TwoPointers;

public class RemoveDuplicatesFromSortedArray {
  // NOTE: leetcode number 26
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[j]) {
        nums[j + 1] = nums[i];
        j = j + 1;
      }
    }
    return j + 1;
  }
}

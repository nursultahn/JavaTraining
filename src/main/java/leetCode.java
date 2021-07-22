import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class leetCode {
    public static void main(String[] args) {
        leetCode leetCode = new leetCode();
//        int[] ints = {1, 1, 1, 1, 1};
//        leetCode.runningSum(ints);
        leetCode.romanToInt("IV");
    }

    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Stream<Integer> boxed = Arrays.stream(nums).boxed();
        return 0;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//    }

    public boolean pollindrom(int i) {
        String s = String.valueOf(i);
        StringBuilder stringBuilder = new StringBuilder(s);
        String s1 = stringBuilder.reverse().toString();
        return s.equals(s1);
    }

    public int[] runningSum(int[] nums) {
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i];
        }
        return nums;
    }

    public int myAtoi(String s) {
        if (s.contains("-")) {
            s = s.replaceAll("\\D", "");
            int i = Integer.parseInt(s);
            return -i;
        } else {
            return Integer.parseInt(s);
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ints = new int[n * 2];
        for (int i = 1; i < nums[n]; i++) {
            ints[i] = nums[i];
        }
        return ints;
    }

    public int romanToInt(String s) {
        String all = s.replaceAll("I", " 1")
                .replaceAll("V", " 5")
                .replaceAll("X", " 10")
                .replaceAll("L", " 50")
                .replaceAll("C", " 100")
                .replaceAll("D", " 500")
                .replaceAll("M", " 1000");
        String[] s1 = all.split(" ");
        int integer = 0;
        for (int i = 1; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            integer += i1;
        }
        return integer;
    }
}

package kataTraining;


import org.junit.Test;

import java.math.BigInteger;
import java.util.*;

public class Kata {

    public static void main(String[] args) {
//        System.out.println(even_or_odd(7));
        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
//        int n = 30;
//        System.out.println(perimeter(BigInteger.valueOf(n)));
    }

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static String whoLikesIt(String... names) {
        int length = names.length;
        if (length == 0) {
            return "no one likes this";
        } else if (length == 1) {
            return names[0] + " likes this ";
        } else if (length == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (length == 3) {
            return names[0] + "," + names[1] + " and " + names[2] + " like this";
        } else {
            int i = length - 2;
            return names[0] + " and " + names[1] + i + "others like this";
        }

    }


    public static String even_or_odd(int number) {
        int i = number % 2;
        if (i == 0) {
            return "Even";
        }
        return "Odd";
    }


    public static String highAndLow(String numbers) {
        String[] s = numbers.split(" ");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String item : s) {
            Integer value = Integer.valueOf(item);
            integers.add(value);
        }
        Arrays.sort(new ArrayList[]{integers});
        return integers.get(0) + " " + integers.get(integers.size() - 1);
    }

    public static boolean getXO(String str) {
        char[] chars = str.toCharArray();
        ArrayList<String> xs = new ArrayList<>();
        ArrayList<String> os = new ArrayList<>();
        for (char aChar : chars) {
            String s = String.valueOf(aChar);
            if (s.equals("x") || s.equals("X")) {
                xs.add(s);
            } else if (s.equals("o") || s.equals("O")) {
                os.add(s);
            }
        }
        return os.size() == xs.size();
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static BigInteger perimeter(BigInteger n) {
        List<String> list = Collections.singletonList("0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711");
        int count = Integer.parseInt(list.get(n.intValue() + 1));
        for (int i = 0; i < n.intValue() + 1; i++) {
            count += Integer.parseInt(list.get(i));
        }
        return BigInteger.valueOf(4 * count);
    }

    public static long fib(int n) {
        if (n <= 1) return n;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

//    public static boolean isAnagram(String test, String original) {
//        if (test.length() != original.length()) {
//            return false;
//        }
//        return sort(test).equals(sort());
//    }

    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return String.valueOf(content);
    }

    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        } else {
            String[] s = words.split(" ");
            List<String> list = new ArrayList<>();
            System.out.println(s.length);
            for (int i = 0; i < s.length; i++) {
                list.add("");
            }
            for (String s1 : s) {
                Integer integer = Integer.valueOf(s1.replaceAll("[\\D]", ""));
                list.add(integer, s1 );
            }
            System.out.println(list);
        }
        return "";
    }

}
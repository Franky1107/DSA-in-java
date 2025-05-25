package string;

import java.util.Arrays;

import java.util.*;;

public class anagram {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = new String("race");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() == s2.length()) {
            char[] s1array = s1.toCharArray();
            char[] s2array = s2.toCharArray();
            Arrays.sort(s1array);
            Arrays.sort(s2array);

            boolean result = Arrays.equals(s1array, s2array);
            if (result) {
                System.out.println(" anagram");
            } else
                System.out.println("Not anagram");
        } else {
            System.out.println("Not anagram");
        }
    }

}

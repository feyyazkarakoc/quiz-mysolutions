package quiz;

import java.util.HashSet;
import java.util.Set;

public class Q_05 {

    public static void main(String[] args) {

        //Java Program to Find All the Permutations of a String.

        System.out.println(findPermutations("Java"));
        System.out.println("Permutation count : " + findPermutations("Java").size());


    }


    public static Set<String> findPermutations(String str) {

        Set<String> permutations = new HashSet<>();
        if (str == null || str.isEmpty()) {
            permutations.add("");
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            Set<String> subPermutations = findPermutations(remainingChars);

            for (String w : subPermutations) {
                permutations.add(ch + w);
            }

        }

        return permutations;


    }
}

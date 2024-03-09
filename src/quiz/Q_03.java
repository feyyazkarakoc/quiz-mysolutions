package quiz;

import java.util.HashMap;

public class Q_03 {

    public static void main(String[] args) {

        //Java Program to Find Duplicate Characters in a String.

        String str = "Java";
        String[] characters = str.split("");
        HashMap<String, Integer> characterMap = new HashMap<>();

        for (String w : characters) {
            if (str.indexOf(w) != str.lastIndexOf(w)) {
                Integer count = characterMap.get(w);
                if (count == null) {
                    characterMap.put(w, 1);
                } else {
                    characterMap.put(w, count + 1);
                }
            }
        }
        System.out.println(characterMap);
    }
}

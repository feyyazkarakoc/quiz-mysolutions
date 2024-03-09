package quiz;

import java.util.HashMap;
import java.util.Map;

public class Q_04 {

    public static void main(String[] args) {

        //Java Program to Find Duplicate Words in a String

        String sentence = "Java Java is is  very very easy.";
        sentence = sentence.replace("\\.", "");
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();

        for (String w : words) {
            Integer count = wordMap.get(w);

            if (count == null) {
                wordMap.put(w, 1);
            } else {
                wordMap.put(w, count + 1);
            }
        }

        for (Map.Entry<String, Integer> w : wordMap.entrySet()) {

            if (w.getValue() > 1) {
                System.out.println("\"" + w.getKey() + "\" occurence count: " + w.getValue());
            }
        }


    }
}

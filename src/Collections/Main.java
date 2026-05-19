package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        ArrayList<String> List = new ArrayList<>();
        Collections.addAll(List, new String[]{"Marcel", "Ionel", "Georgel", "Dorel", "Firicel"});

        for(String s : List) {
            System.out.println(s);
        }

        List.remove(2);
        List<Integer> List2 = new ArrayList<>(10);
        int sum = 0;

        for(int i = 0; i < 10; ++i) {
            List2.add(i);
            sum += i;
        }

        float avg = (float)sum / (float)List2.size();
        System.out.println(sum);
        System.out.println(avg);
        Collections.reverse(List2);
        System.out.println(List2);
        String sentence = "Mihai este cel mai mare dinamovist ale ale ale";
        String[] words = sentence.split(" ");
        Set<String> Set = new HashSet<>();
        Collections.addAll(Set, words);
        System.out.println(Set);
        System.out.println(Set.size());
        sentence = "apple banana apple orange banana apple";
        words = sentence.split(" ");
        HashMap<String, Integer> Map = new HashMap<>();

        for(String word : words) {
            int count = 0;
            if (Map.containsKey(word)) {
                count = (Integer)Map.get(word);
            }

            Map.put(word, count + 1);
        }

        System.out.println(Map);
        HashMap<String, String> Map2 = new HashMap<>();
        Map2.put("Vasile Traian", "0731715114");
        Map2.put("Nicusor Dan", "0724565370");
        System.out.println((String)Map2.get("Vasile Traian"));

        for(String name : Map2.keySet()) {
            System.out.println(name + " " + (String)Map2.get(name));
        }
    }
}

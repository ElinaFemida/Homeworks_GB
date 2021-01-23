package HOMEWORKS_GB.Lesson3_Java2;

import java.util.TreeMap;

public class MapClass {
    public static void main(String[] args) {
        String src = "Moscow, Berlin, Roma, Ufa, Paris, Kazan, Moscow, Ufa, London, Paris, Roma, Sochi, Kazan, Madrid, Berlin";
        String arr[] = src.split(", +");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String capital : arr) {
            map.put(capital, map.getOrDefault(capital, 0) + 1);
        }
        System.out.println("My list of capitals: " + map);
    }
}

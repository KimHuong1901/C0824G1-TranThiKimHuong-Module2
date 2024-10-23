package ss11;

import java.util.TreeMap;

public class UseTreeMap {
    public static void main(String[] args) {
        String stringText = ("Hello World").toUpperCase();
        String [] textArray = stringText.split(" ");
        TreeMap<String, Integer> data = new TreeMap<>();
        for (String text : textArray) {
            if (!data.containsKey(text)) {
                data.put(text, 1);
            } else {
                data.put(text, data.get(text) + 1);
            }
        }
        for (String text : data.keySet()) {
            System.out.println(text + " " + data.get(text));
        }
    }
}

import java.util.*;

public class MyGenerator implements RomanNumeralGenerator {

    HashMap<Integer, String> hmap = new HashMap<Integer, String>();

    public String generate(int number) {
        hmap.put(1, "I");
        hmap.put(4, "IV");
        hmap.put(5, "V");
        hmap.put(9, "IX");
        hmap.put(10, "X");

        if (hmap.containsKey(number)) {
            return hmap.get(number);
        }

        ArrayList<Integer> numeralSet = new ArrayList<Integer>();

        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            Integer key = entry.getKey();

            if (key < number) {
                numeralSet.add(key);
            }
        }
        int lastHighest = Collections.max(numeralSet);

        return hmap.get(lastHighest) + generate(number - lastHighest);
    }
}

import java.util.*;

public class MyGenerator implements RomanNumeralGenerator {

    HashMap<Integer, String> hmap = new HashMap<Integer, String>();

    public String generate(int number) {
        if (number <= 0 || number >= 3999) return null;

        hmap.put(1, "I");
        hmap.put(4, "IV");
        hmap.put(5, "V");
        hmap.put(9, "IX");
        hmap.put(10, "X");
        hmap.put(40, "XL");
        hmap.put(50, "L");
        hmap.put(90, "XC");
        hmap.put(100, "C");
        hmap.put(400, "CD");
        hmap.put(500, "D");
        hmap.put(900, "CM");
        hmap.put(1000, "M");

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

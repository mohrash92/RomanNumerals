import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MyGenerator implements RomanNumeralGenerator{

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
        String numeral = "";
        ArrayList<Integer> numeralSet = new ArrayList<Integer>();

        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            Integer key = entry.getKey();
//            String value = entry.getValue();

            if (key < number) {
                numeralSet.add(key);
            }
        }

        System.out.println(numeral);
        for(int i = 0; i < number; i++) {
            numeral += 'I';
        }

//        System.out.println(number);
        return numeral;
    }
}

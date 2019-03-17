import java.util.HashMap;

public class MyGenerator implements RomanNumeralGenerator{

    HashMap<Integer, String> hmap = new HashMap<Integer, String>();

    public String generate(int number) {
        hmap.put(4, "IV");
        hmap.put(5, "V");

        String romanNumeral = "";
        switch (number) {
            case 1:
            case 2:
            case 3:
                return concatString(number, romanNumeral);
            case 4:
                return hmap.get(4);
            case 5:
                return hmap.get(5);
        }

        return romanNumeral;
    }

    public String concatString(int number, String romanNumeral) {
        for (int i = 0; i < number; i++) {
            romanNumeral += 'I';
        }
        return romanNumeral;
    }
}

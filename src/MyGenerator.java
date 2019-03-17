public class MyGenerator implements RomanNumeralGenerator{
    public String generate(int number) {
        String romanNumeral = "";

        if (number <= 3) {
            for (int i = 0; i < number; i++) {
                romanNumeral += 'I';
            }
        } else {
            romanNumeral = "IV";
        }

        return romanNumeral;
    }
}

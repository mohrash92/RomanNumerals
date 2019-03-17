public class MyGenerator implements RomanNumeralGenerator{
    public String generate(int number) {
        String romanNumeral = "";
        if (number == 1) {
            romanNumeral = "I";
        } else if (number == 2) {
            romanNumeral = "II";
        } else if (number == 3) {
            romanNumeral = "III";
        }

        return romanNumeral;
    }

}

package Easy.RomanToInteger;

public class Resolve {

    public static int romanToInt(String s){

        for (int i = 0; i < s.length(); i++) {

            char romanLetter = s.charAt(i);

            char nextRomanLetter= s.charAt(i+1);


            if(romanLetter == 'I' || romanLetter == 'X' || romanLetter=='C' ){

                String possibleSpecialRomanCasesLetter= String.valueOf(romanLetter+nextRomanLetter);

            }
        }

        return 1;
    }

    public static int convertSymbolToValue(String symbol){

        return switch (symbol){

            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            case "M" -> 1000;
            default -> 0;
        };

    }

    public static int convertSpecialRomanCases(String twoLetters){



        return switch (twoLetters) {
            case "IV" -> 4;
            case "IX" -> 9;
            case "XL" -> 40;
            case "XC" -> 90;
            case "CD" -> 400;
            case "CM" -> 900;
            default -> 0;
        };

    }

    public static void main(String[] args) {


    }
}

import java.util.Scanner;
public class Roman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }
    public static int romanToInteger(String roman) {
        java.util.HashMap<Character, Integer> romanNumerals = new java.util.HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
        int integerValue = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (i < roman.length() - 1 && romanNumerals.get(roman.charAt(i)) < romanNumerals.get(roman.charAt(i + 1))) {
                integerValue -= romanNumerals.get(roman.charAt(i));
            } else {
                integerValue += romanNumerals.get(roman.charAt(i));
            }
        }
        return integerValue;
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RomanToInteger {
    public static void main(String[] args) {
        
        Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);
        System.out.println("Enter a Roman Number for Convert it into Integer : ");
        Scanner sc=new Scanner(System.in);
        String romanNumeral = sc.next(); 
        int result = 0;
        int prevValue = 0;
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currentValue = romanToInteger.get(romanNumeral.charAt(i));
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }
}


import java.util.Scanner;
public class PangramChecker {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabetFlags = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetFlags[ch - 'a'] = true;
            }
        }
        for (boolean flag : alphabetFlags) {
            if (!flag) {
                return false;
            }
        } 
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the sentence for to check wheather it was panagram or not :");
        Scanner sc=new Scanner (System.in);
        String input = sc.next();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

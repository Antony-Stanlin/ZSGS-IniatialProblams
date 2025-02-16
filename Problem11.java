import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string:");
        String s = sc.nextLine();

        String result = "";
        String tempVal = "";
        String tempChar = "";

        for (char c : s.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                if (!tempChar.isBlank())
                    result += tempChar.repeat(Integer.parseInt(tempVal));
                tempChar = c + "";
                tempVal = "";
            } else
                tempVal += c;
        }

        result += tempChar.repeat(Integer.parseInt(tempVal));

        System.out.println(result);
    }
}

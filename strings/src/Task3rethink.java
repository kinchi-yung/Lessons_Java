import java.util.Scanner;

public class Task3rethink {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        String lowercaseInputString = inputString.toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0, j = lowercaseInputString.length() - 1; i < lowercaseInputString.length(); i++, j--) {
            if (lowercaseInputString.charAt(i) != lowercaseInputString.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Строка является палиндромом.");
        } else {
            System.out.println("Строка не является палиндром.");
        }
    }

}

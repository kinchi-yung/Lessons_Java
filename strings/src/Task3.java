import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Проверка на палиндром");
        System.out.println("Введите слово: ");
        String word = keyboard.next();

        word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            for (int j = (word); j > 0; j--) {
                if (word.indexOf(i) == word.indexOf(j)) {


                    System.out.println("Ваше слово " + word + " палиндром");

                } else if (word.indexOf(i) != word.indexOf(j)) {
                    System.out.println("Ваше слово " + word + " не палиндром");

                }

            }
        }
    }
}

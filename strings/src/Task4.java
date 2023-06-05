import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите своё предложение: ");
        String sent = keyboard.nextLine();

        System.out.println("Какое слово нужно посчитать в предложении?");
        String wordToCount = keyboard.next();

        int count=0;

        String[] words = sent.split(" ");

        for (String word : words) {
            if (word.equalsIgnoreCase(wordToCount)) {
                count++;
            }
        }

        System.out.println("Слово \"" + wordToCount + "\" встречается в предложении " + count + " раз(а).");

        System.out.println("Кол-во вхождений определенного слова в предложение: "+count);
    }
}

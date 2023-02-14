import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите строку для шифровки: ");
        String sentence = keyboard.nextLine();
        char[] sentence1 = sentence.toCharArray();
        System.out.println("На сколько символов сдвигаем: ");
        int code = keyboard.nextInt();

        for (int i = 0; i < sentence1.length; i++) {
            sentence1[i] = (char) (sentence1[i] + code);
        }

        String encrypted = String.valueOf(sentence1);
        System.out.println(String.format("Зашифрованное сообщение: %s", encrypted));
        System.out.println(String.format("Исходное сообщение: %s, шифр: %d",sentence , code));
    }

}
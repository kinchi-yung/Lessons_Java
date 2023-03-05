import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите своё предложение: ");
        String sent = keyboard.nextLine();

        System.out.println("Какое слово нужно посчитать в предложении?");
        String devidee = keyboard.next();

        int i=0;
        String[] temp = sent.split(" ");

        for (String e = sent; devidee.equalsIgnoreCase(e); i++){

        }
        System.out.println("Кол-во вхождений определенного слова в предложение: "+i);
    }
}

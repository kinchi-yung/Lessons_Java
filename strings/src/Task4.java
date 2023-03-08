import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите своё предложение: ");
        String sent = keyboard.nextLine();

        System.out.println("Какое слово нужно посчитать в предложении?");
        String devidee = keyboard.next();

        int i=0;
        int count=0;
        String[] temp = sent.split(" ");

        for (String e = temp[i]; i< temp.length ; i++){
            if (devidee.equalsIgnoreCase(e)){
                count=count+1;
            }else{
                break;
            }
        }
        System.out.println("Кол-во вхождений определенного слова в предложение: "+count);
    }
}

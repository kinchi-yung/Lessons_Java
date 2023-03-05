import java.util.Scanner;

public class Task3 {

    static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Проверка на палиндром");
        System.out.println("Введите слово: ");

        String word = keyboard.next();
        word.toLowerCase();

        //ВАРИАНТ 1
//        if (isPalindrome(word)==true){
//            System.out.println("Ваше слово палиндром " +word);
//        }else{
//            System.out.println("Ваше слово не палиндром " +word);
//        }


        //ВАРИАНТ 2
        for (int i = 0; i < (word.length() / 2); i++) {
            for (int j = word.lastIndexOf(word); j > (word.length() / 2); j--) {
                if (word.indexOf(i) == word.indexOf(j)) {
                    System.out.println("Ваше слово \"" + word + "\" палиндром");
                    break;
                } else if (word.indexOf(i) != word.indexOf(j)) {
                    System.out.println("Ваше слово \"" + word + "\" не палиндром");
                    break;
                }

            }
        }



        //ВАРИАНТ 3
//        StringBuffer buffer = new StringBuffer(word);
//        buffer.reverse();
//        String data = buffer.toString();
//        if(word.equals(data)){
//            System.out.println("Ваше слово \""+ word +"\" палиндром");
//        }else{
//            System.out.println("Ваше слово \""+ word +"\" не палиндром");
//        }
    }
}

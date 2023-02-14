
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] array = new int[5];
        int temp = 0;

        System.out.println("Введите 5 чисел");

        for (int i = 0; i < 6; i++) {
            switch (i) {
                case (1) -> {
                    System.out.println("Введите Первое число: ");
                    array[0] = keyboard.nextInt();
                }
                case (2) -> {
                    System.out.println("Введите Второе число: ");
                    array[1] = keyboard.nextInt();
                }
                case (3) -> {
                    System.out.println("Введите Третье число: ");
                    array[2] = keyboard.nextInt();
                }
                case (4) -> {
                    System.out.println("Введите Четвёртое число: ");
                    array[3] = keyboard.nextInt();
                }
                case (5) -> {
                    System.out.println("Введите Пятое число: ");
                    array[4] = keyboard.nextInt();
                }
            }
        }
        for (int e : array){
            if (e!=0){
                temp = e;
                temp = temp%2;
                if (temp==0)
                System.out.println("Число "+e+" чётное");
            } if (temp!=0){
                System.out.println("Число "+e+" не чётное");
            }
        }
    }
}
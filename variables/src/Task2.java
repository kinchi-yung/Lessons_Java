import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int origin = 256;
        double discount = ((origin / 1) * 0.1); //10%
        double deal = (origin - discount);

        System.out.println("Окончательная цена: " + deal);

    }
}

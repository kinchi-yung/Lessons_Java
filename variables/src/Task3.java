import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        float celsius = 36.6f;
        float fahrenheit = (1.8f*celsius + 32);

        System.out.println("Перевод в фаренгейт: "+fahrenheit);
    }
}
//сразу написал посчитанный коэффицент 1.8 т.к. нет смысла доп считать его в проге,
// да и оно не хотело считать
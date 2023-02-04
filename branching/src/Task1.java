

public class Task1 {

    public static void main(String[] args) {

        int result = 81;

        if (result <= 25 && result >= 1) {
            System.out.println("Плохо");
        } else if (result >= 26 && result <= 50) {
            System.out.println("Ниже среднего");
        } else if (result >= 51 && result <= 75) {
            System.out.println("Выше среднего");
        } else if (result >= 76 && result <= 100) {
            System.out.println("Отлично");
        } else {
            System.out.println("Ошибка");
        }
    }
}

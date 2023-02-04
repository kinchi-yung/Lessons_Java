


public class Task2 {
    public static void main(String[] args) {

        int cash = 159_890;
        String company = "Bank";
        int Tax;

        if (cash <= 250_000) {

            Tax = (int) (cash * 0.1);
            System.out.println("Налог на сумму " + cash + " для отрасли " + company + " составляет: " + Tax);
            System.out.println("Это составляет 10%");
        } else if (cash >= 250_000 && cash <= 499_999) {
            Tax = (int) (cash * 0.15);
            System.out.println("Налог на сумму " + cash + " для отрасли " + company + " составляет: " + Tax);
            System.out.println("Это составляет 15%");
        } else {
            Tax = (int) (cash * 0.18);
            System.out.println("Налог на сумму " + cash + " для отрасли " + company + " составляет: " + Tax);
            System.out.println("Это составляет 18%");
        }

    }
}
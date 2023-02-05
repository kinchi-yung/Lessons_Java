
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        double earnings = 159_890;
        String BankCo = "Bank";
        String TransportCo = "Transport";
        String HealthCo = "Health";
        double tax;

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Выберите номер соответсвующий вашей компании");
        System.out.println("1. bank \n2. Transport \n3. Health");
        int companyType = Keyboard.nextInt();


        if (companyType == 1) {

            if (earnings <= 250_000) {
                tax = (earnings * 0.1);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + BankCo + " составляет: " + tax);
                System.out.println("Это составляет 10%");
            } else if (earnings >= 250_000 && earnings <= 499_999) {
                tax = (earnings * 0.15);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + BankCo + " составляет: " + tax);
                System.out.println("Это составляет 15%");
            } else {
                tax = (earnings * 0.18);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + BankCo + " составляет: " + tax);
                System.out.println("Это составляет 18%");
            }
        } else if (companyType == 2) {
            if (earnings <= 100_000) {
                tax = (earnings * 0.09);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + TransportCo + " составляет: " + tax);
                System.out.println("Это составляет 9%");
            } else if (earnings >= 100_000 && earnings <= 299_999) {
                tax = (earnings * 0.13);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + TransportCo + " составляет: " + tax);
                System.out.println("Это составляет 13%");
            } else {
                tax = (earnings * 0.17);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + TransportCo + " составляет: " + tax);
                System.out.println("Это составляет 17%");
            }
        }
        else {
            if (earnings <= 250_000) {
                tax = (earnings * 0.07);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + HealthCo + " составляет: " + tax);
                System.out.println("Это составляет 7%");
            } else if (earnings >= 250_000 && earnings <= 499_999) {
                tax = (earnings * 0.12);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + HealthCo + " составляет: " + tax);
                System.out.println("Это составляет 12%");
            } else {
                tax = (earnings * 0.15);
                System.out.println("Налог на сумму " + earnings + " для отрасли " + HealthCo + " составляет: " + tax);
                System.out.println("Это составляет 15%");
            }
        }

    }
}
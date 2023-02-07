


public class Task3 {
    public static void main(String[] args) {

        int balance = 997;
        int cashout = 560;
        int limit = 1500;

        int ruble = 20;
        int out;
        int ostatok = 0;

        System.out.println("Банкомат имеет только купюры по 20р.");

        if (cashout > limit) {

            System.out.println("Допустимая сумма для снятия не более 1500р.");

        } else {

            if (cashout > balance) {
                System.out.println("На вашем счету нет такой суммы.");
            } else {
                out = (cashout % ruble);
                if (out!=0){

                    System.out.println("Нельзя снять такую сумму");

                }
                else {
                    balance = balance - cashout;
                    System.out.println("Операция прошла успешно");
                    System.out.println("Остаток на счету: " + balance);
                }

            }

        }
        
    }
}
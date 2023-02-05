


public class Task3 {
    public static void main(String[] args) {

        int balance = 997;
        int cashout = 557;
        int limit = 1500;
        int ruble = 20;
        int out;
        int ostatok = 0;

        System.out.println("Банкомат имеет только купюры по 20р.");

        if (cashout > limit) {

            System.out.println("Допустимая сумма для снятия не более 1500р.");

        } else if (cashout <= limit) {

            if (cashout > balance) {
                System.out.println("На вашем счету нет такой суммы.");
            } else if (cashout <= balance) {

                out = (cashout % ruble);
                ostatok +=balance-(cashout-out);
                System.out.println("Операция прошла успешно");
                System.out.println("Остаток со списания: "+out);
                System.out.println("Остаток на счету: "+ostatok);


            }

        }
        //System.out.println(ostatok); проверка на корректное присваивания
    }
}

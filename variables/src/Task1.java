import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1;


        char e = 'e';

        float f = 3.14f;
        double g = 4.444;

        boolean j = true;

        String k = "ok";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(j);
        System.out.println(k);

        //сложение, вычитание, умножение, деление, остаток от деления, инкремент и декремент

        System.out.println("Переменные: 1) a " +
                "2) b " +
                "3) c " +
                "4) d " +
                "5) e " +
                "6) f " +
                "7) g ");
        System.out.println("Выберите операции какой переменной хотите увидеть: ");
        int choose = Keyboard.nextInt();

        switch (choose) {
            case 1 -> {

                //a
                System.out.println(a - a);
                System.out.println(a + a);
                System.out.println(a * a);
                System.out.println(a / a);
                System.out.println(a % 1);
                System.out.println(++a);
                System.out.println(--a);
                //a
                break;
            }
            case 2 -> {
                //b
                System.out.println(b - b);
                System.out.println(b + b);
                System.out.println(b * b);
                System.out.println(b / b);
                System.out.println(b % b);
                System.out.println(--b);
                System.out.println(++b);
                //b
                break;
            }
            case 3 -> {
                //c
                System.out.println(c - c);
                System.out.println(c + c);
                System.out.println(c * c);
                System.out.println(c / c);
                System.out.println(c % c);
                System.out.println(--c);
                System.out.println(++c);
                //c
                break;
            }
            case 4 -> {
                //d
                System.out.println(d - d);
                System.out.println(d + d);
                System.out.println(d * d);
                System.out.println(d / d);
                System.out.println(d % d);
                System.out.println(--d);
                System.out.println(++d);
                //d
                break;
            }
            case 5 -> {
                //e
                System.out.println(e - e);
                System.out.println(e + e);
                System.out.println(e * e);
                System.out.println(e / e);
                System.out.println(e % e);
                System.out.println(--e);
                System.out.println(++e);
                //e
                break;
            }
            case 6 -> {
                //f
                System.out.println(f - f);
                System.out.println(f + f);
                System.out.println(f * f);
                System.out.println(f / f);
                System.out.println(f % f);
                System.out.println(--f);
                System.out.println(++f);
                //f
                break;
            }
            case 7 -> {
                //g
                System.out.println(g - g);
                System.out.println(g + g);
                System.out.println(g * g);
                System.out.println(g / g);
                System.out.println(g % g);
                System.out.println(--g);
                System.out.println(++g);
                //g
                break;
            }
        }


    }

}

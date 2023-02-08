


public class Task2 {
    public static void main(String[] args){

        int[] numbers = new int[10];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 44;
        numbers[3] = 32;
        numbers[4] = 78;
        numbers[5] = 56;
        numbers[6] = 13;
        numbers[7] = 6;
        numbers[8] = 9;
        numbers[9] = 19;

        int numbersSummary = 0;
        double average=0;

        for (int i = 0; i<numbers.length; i++){
            numbersSummary += numbers[i] ;
            average = (numbersSummary/numbers.length);

        }
        System.out.println("Сумма всех чисел массива: "+numbersSummary);
        System.out.println("Среднее значение массива: "+average);
    }
}
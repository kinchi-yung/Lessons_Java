


public class Task3 {
    public static void main(String[] args){

        int[] mass1 = new int[10];

        mass1[0] = -4;
        mass1[1] = 5;
        mass1[2] = 44;
        mass1[3] = 32;
        mass1[4] = 78;
        mass1[5] = 56;
        mass1[6] = 13;
        mass1[7] = -3;
        mass1[8] = 9;
        mass1[9] = 19;

        int temporary;


        for (int i = 0; i < mass1.length; i++) {
            for (int j = i + 1; j < mass1.length; j++){
                if (mass1[i] > mass1[j]) {
                    temporary = mass1[i];
                    mass1[i] = mass1[j]; mass1[j] = temporary;
                }else do {
                    for (i = 1; i < mass1.length; i++){
                        for (j = i + 1; j < mass1.length; j++) {

                            if (mass1[i] > mass1[j]) {
                                temporary = mass1[i];
                                mass1[i] = mass1[j]; mass1[j] = temporary;
                            }
                        }
                    }
                }while(i!=10);
            }
        }
        System.out.println("Второй наименьший элемент: " + mass1[1]);
    }
}
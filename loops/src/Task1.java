
public class Task1 {

    public static void main(String[] args) {


        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Bob";
        names[2] = "Mary";
        names[3] = "Peter";
        names[4] = "Sarah";


        //      ЦИКЛ FOR

        for (String word : names) {
            int length = word.length();
            if (length < 4) {
                System.out.println("Ваше имя короче 4 букв");
            } else if (length > 4) {
                System.out.println("Ваше имя длиннее 4 букв");
            } else {
                System.out.println("Ваше имя состоит из 4 букв");
            }

        }


        // ЦИКЛ WHILE

//        int i = 0;
//
//        while (i < names.length) {
//            String word = names[i];
//            if (word.length() < 4) {
//                System.out.println("Ваше имя короче 4 букв");
//            } else if (word.length() > 4) {
//                System.out.println("Ваше имя длиннее 4 букв");
//            } else {
//                System.out.println("Ваше имя состоит из 4 букв");
//            }
//            i++;
//        }


        //ЦИКЛ DO... WHILE

//        int i =-1;
//        do {
//            i++;
//            String word = names[i];
//            if (word.length() < 4) {
//                System.out.println("Ваше имя короче 4 букв");
//            } else if (word.length() > 4) {
//                System.out.println("Ваше имя длиннее 4 букв");
//            } else {
//                System.out.println("Ваше имя состоит из 4 букв");
//            }
//            if (i==4){
//                break;
//            }
//
//        }while(i < names.length);

    }
}

// "ctrl" + "/" комментирует выделенные строки и обратно

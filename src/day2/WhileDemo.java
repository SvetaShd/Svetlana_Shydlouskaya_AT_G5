package day2;

public class WhileDemo {

    public static void main(String[] args) {


        for (int i = 23; i < 28; i++) {

            if (i % 13 == 0) {

                System.out.println("continue!");
                break;
                //return;
                //continue;

            }
            System.out.println("i is: " + i);

        }


    }


}

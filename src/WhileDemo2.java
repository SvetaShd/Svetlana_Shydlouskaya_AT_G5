import java.util.Random;

public class WhileDemo2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(100);
        }

        int e = 0;

        for (int i : array) {
            e = i;
            System.out.println(i);
        }


    }
}

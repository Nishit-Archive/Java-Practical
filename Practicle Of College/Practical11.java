import java.util.Random;

public class Practical11 {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randomInt = rand.nextInt(49) + 1;
            System.out.println(randomInt);
        }
    }
}

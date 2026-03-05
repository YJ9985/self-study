package lang2.system;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random r = new Random();

        int randomInt = r.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = r.nextDouble();
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = r.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);

        int randomRange1 = r.nextInt(10);
        System.out.println("0 ~ 9: " + randomRange1);

        int randomRange2 = r.nextInt(10) + 1;
        System.out.println("1 ~ 10: " + randomRange2);

//        Random r2 = new Random(2);
    }
}

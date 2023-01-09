package homework5;

import java.util.Arrays;
import java.util.Random;

public class zeros {
    public static void main(String[] args) {

        int[] newArray = generateIntArray(10);

        for (int i = 0; newArray.length > i; i++){
            if (newArray[i] % 2 == 0) {
                newArray[i] = 0;
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
    public static int getSomeNum() {
        Random random = new Random();
        return random.nextInt(100);
    }
    public static int[] generateIntArray(int length) {
        int[] intArray = new int[length];
        for (int i = 0; intArray.length > i; i++) {
            intArray[i] = getSomeNum();
        }
        return intArray;
    }
}

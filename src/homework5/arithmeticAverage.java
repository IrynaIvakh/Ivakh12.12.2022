package homework5;

import java.util.Arrays;
import java.util.Random;

public class arithmeticAverage {
    public static void main(String[] args) {

        int[] newArray = generateIntArray(10);
        double sumAvr = 0;
        double sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum = sum + newArray[i];
            sumAvr = sum / newArray.length;
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println(sumAvr);
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


